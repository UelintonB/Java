/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula13_exe2_patrickacguerra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Patrick Guerra
 */
public class JogoAjudante {
    private static final String alfabeto = "abcdeff";
    private int comprimentoTab = 7;
    private int tamanhoTab = 49;
    private int [] tabuleiro = new int[tamanhoTab];
    private int comCount = 0;
    
    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.print(prompt + " ");
        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length() == 0) return null;
        } catch(IOException e){
            System.out.println("IOException: "+ e);
        }
        return inputLine.toLowerCase();
    }
    
    public ArrayList<String> placeDotCom(int TamanhoCom){
        ArrayList<String> alfabCelulas = new ArrayList<String>();
        String [] alfabCoordenadas = new String [TamanhoCom];
        String temp = null;
        int [] coordenadas = new int[TamanhoCom];
        int tentativas = 0;
        boolean sucesso = false;
        int localizacao = 0;
        comCount++;
        int incr = 1;
        if((comCount % 2) == 1)
            incr = comprimentoTab;
        while(!sucesso & tentativas++ < 200){
            localizacao = (int) (Math.random() * tamanhoTab);
            int x = 0;
            sucesso = true;
            while(sucesso && x < TamanhoCom){
                if(tabuleiro[localizacao] == 0){
                    coordenadas[x++] = localizacao;
                    localizacao += incr;
                    if(localizacao >= tamanhoTab)
                        sucesso = false;
                    if(x>0 && (localizacao % comprimentoTab == 0))
                        sucesso = false;
                }else{
                    sucesso = false;
                }
            }
        }
        int x = 0;
        int linha = 0;
        int coluna = 0;
        while(x < TamanhoCom){
            tabuleiro[coordenadas[x]] = 1;
            linha = (int) (coordenadas[x] / comprimentoTab);
            coluna = coordenadas[x] % comprimentoTab;
            temp = String.valueOf(alfabeto.charAt(coluna));
            alfabCelulas.add(temp.concat(Integer.toString(linha)));
            x++;
        }
        return alfabCelulas;
    }
}
