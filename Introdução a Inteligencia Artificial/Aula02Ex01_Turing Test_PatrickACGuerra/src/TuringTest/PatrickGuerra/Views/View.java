/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TuringTest.PatrickGuerra.Views;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Patrick Guerra
 */
public class View {

    public View() {
    }
    
    public void imprimeValor(String valor){
        System.out.println(valor);
    }
    
    public void imprimePrint(String valor){
        System.out.print(valor);
    }
    
    public void imprimeErro(String erro){
        System.err.println(erro);
    }
    
    public String getString(){
        Scanner entrada = new Scanner(System.in);
        String valor = entrada.nextLine();
        //entrada.close();
        return valor;
    }
    
    public Integer getInteger(){
        Scanner entrada = new Scanner(System.in);
        Integer valor = entrada.nextInt();
        //entrada.close();
        return valor;
    }
    
    public String getData(){
        // data/hora atual
        LocalDateTime agora = LocalDateTime.now();

        // formatar a data
        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = formatterData.format(agora);
        return dataFormatada;
        
    }
    
    public String getHora(){
        // data/hora atual
        LocalDateTime agora = LocalDateTime.now();
        
        // formatar a hora
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormatada = formatterHora.format(agora);
        return horaFormatada;
    }
}
