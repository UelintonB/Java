/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aulapersistenciaarquivosequencial;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Patrick Guerra
 */
public class ManipulaFuncionarioDataStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException{
        // TODO code application logic here
        DataOutputStream out = null;
        
        List<Funcionario> arrayFuncionarios = null;
        arrayFuncionarios = new ArrayList<Funcionario>();
        
        Funcionario funcionario;
        
        funcionario = new Funcionario(1, "Marcia", "012.345.678-90", "01/01/1980", 1000);
        arrayFuncionarios.add(funcionario);
        
        funcionario = new Funcionario(2, "Carlos", "234.564.458-80", "30/04/1976", 2000);
        arrayFuncionarios.add(funcionario);
        
        try{
            System.out.println("Abrindo arquivo funcionario.par para gravacao...");
            out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("funcionario.par", true)));
            System.out.println("Gravando dados no arquivo funcionario.par ...");
            arrayFuncionarios.get(0).salva(out);
            arrayFuncionarios.get(1).salva(out);
        } finally{
            System.out.println("Fechando arquivo funcionario.par...");
            if(out != null){
                out.close();
            }
        }
        
        DataInputStream in = null;
        arrayFuncionarios = new ArrayList<Funcionario>();
        try{
            System.out.println("Abrindo arquivo funcionario.par");
            in = new DataInputStream( new BufferedInputStream( new FileInputStream("funcionario.par")));
            System.out.println("Lendo os dados do arquivo funcionario.par");
            
            while(true){
                funcionario.le(in);
                funcionario.imprime();
                arrayFuncionarios.add(funcionario);
                System.out.println();
            }
        } catch (EOFException e){
            System.out.println("Já leu todos os regidtros do arquivo..."+e);
        } finally{
            System.out.println("Fechando arquivo funcionario.par ...");
            if(in != null)
                in.close();
        }
    }

}
