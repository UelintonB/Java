/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufsm.poo.cadastro.dados;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Patrick Guerra
 */
public class CadastroProdutoDados {
    DataOutputStream out = null;

    public void gravaProduto(String nomeProduto, String especificacaoTecnica, double precoVenda, double precoCusto, int habilitarVenda) throws FileNotFoundException, IOException{
        out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("produtos.par", true)));
        out.writeUTF(nomeProduto);
        out.writeUTF(especificacaoTecnica);
        out.writeDouble(precoVenda);
        out.writeDouble(precoCusto);
        out.writeInt(habilitarVenda);
        out.close();
    }
}
