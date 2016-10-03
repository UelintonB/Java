/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.ordenacao.quicksort.nome.iddade;

/**
 *
 * @author patri
 */
public class MetodoQuickSortNome {
    VetorDados vetorDados;
    
    public MetodoQuickSortNome(VetorDados vetorDados){
        this.vetorDados = vetorDados;
    }
    
    public void chamaOrdenacaoNome(){
        ordenacaoQuickSortNome(0, vetorDados.getNumElementosInseridos()-1);
    }
    
    public void troca(int a, int b){
        TReg[] vetor = vetorDados.getVetorDados();
        TReg aux = vetor[a];
        vetor[a] = vetor[b];
        vetor[b] = aux;
    }    
    
    public int particionarNome(int esq, int dir, TReg pivo){
        TReg[] vetor = vetorDados.getVetorDados();
        int PonteiroEsq = esq-1;
        int PonteiroDir = dir;
        while(true){
            while(vetor[++PonteiroEsq].nome.compareTo(pivo.nome) < 0)
                ;
            while(PonteiroDir > 0 && vetor[--PonteiroDir].nome.compareTo(pivo.nome) > 0)
                ;
            if(PonteiroEsq >= PonteiroDir)
                break;
            else
                troca(PonteiroEsq,PonteiroDir);
        }
        troca(PonteiroEsq, dir);
        return PonteiroEsq;
    }
    
    public void ordenacaoQuickSortNome(int esq, int dir){
        TReg[] vetor = vetorDados.getVetorDados();
        if(dir-esq <= 0)                //se tamanho <= 1
            return;                     //ja ordenado
        else{                           //tamanho 2 ou maior
            TReg pivo = vetor[dir];      //item mais a direita
            int particao = particionarNome(esq, dir, pivo);
            ordenacaoQuickSortNome(esq, particao-1);
            ordenacaoQuickSortNome(particao+1, dir);
        }
    }
    
}
