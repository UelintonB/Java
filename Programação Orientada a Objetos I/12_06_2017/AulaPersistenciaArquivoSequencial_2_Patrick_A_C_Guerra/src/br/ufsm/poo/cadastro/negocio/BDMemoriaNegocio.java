/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufsm.poo.cadastro.negocio;

import br.ufsm.poo.cadastro.dados.LeProdutoDados;
import java.util.ArrayList;
import br.ufsm.poo.cadastro.dados.ProdutoModelo;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Patrick Guerra
 */
public class BDMemoriaNegocio {
    private DataInputStream in = null;
    private ArrayList<ProdutoModelo> bdEmMemoria = new ArrayList<ProdutoModelo>();
    private LeProdutoDados leitor = new LeProdutoDados();
    private int contador = 0;
    
    public BDMemoriaNegocio() throws FileNotFoundException, IOException{
        try{
            in = new DataInputStream( new BufferedInputStream( new FileInputStream("produtos.par")));
            while(true){
                bdEmMemoria.add(leitor.le(in));
                contador++;
            }
        } catch (EOFException e){
        } finally{
            if(in != null)
                in.close();
        }
    }

    public ArrayList getBdEmMemoria() {
        return bdEmMemoria;
    }

    public int getContador() {
        return contador;
    }
    
    public ProdutoModelo getRegistro(int index){
        ProdutoModelo produto = new ProdutoModelo();
        produto.setNomeProduto(bdEmMemoria.get(index).getNomeProduto());
        produto.setEspecificacaoTecnica(bdEmMemoria.get(index).getEspecificacaoTecnica());
        produto.setPrecoCusto(bdEmMemoria.get(index).getPrecoCusto());
        produto.setPrecoVenda(bdEmMemoria.get(index).getPrecoVenda());
        produto.setHabilitarVenda(bdEmMemoria.get(index).getHabilitarVenda());
        return produto;
    }
}
