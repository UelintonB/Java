/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ufsm.poo.cadastro.dados;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author Patrick Guerra
 */
public class LeProdutoDados {
    
    public ProdutoModelo le(DataInputStream in) throws IOException{
        ProdutoModelo produto = new ProdutoModelo(
                in.readUTF(),
                in.readUTF(),
                in.readDouble(),
                in.readDouble(),
                in.readInt()
        );
        return produto;
    }
}
