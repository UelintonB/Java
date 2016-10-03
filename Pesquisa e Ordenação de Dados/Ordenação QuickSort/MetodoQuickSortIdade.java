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
public class MetodoQuickSortIdade {
    VetorDados vetorDados;
    
    public MetodoQuickSortIdade(VetorDados vetorDados){
        this.vetorDados = vetorDados;
    }
    
    public void chamaOrdenacaoIdade(){
        ordenacaoQuickSortIdade(0, vetorDados.getNumElementosInseridos()-1);
    }
    
    public void troca(int a, int b){
        TReg[] vetor = vetorDados.getVetorDados();
        TReg aux = vetor[a];
        vetor[a] = vetor[b];
        vetor[b] = aux;
    }    
    
    public int particionarIdade(int esq, int dir, int pivo){
        TReg[] vetor = vetorDados.getVetorDados();
        int PonteiroEsq = esq-1;
        int PonteiroDir = dir;
        while(true){
            while(vetor[++PonteiroEsq].idade < pivo)
                ;
            while(PonteiroDir > 0 && vetor[--PonteiroDir].idade > pivo)
                ;
            if(PonteiroEsq >= PonteiroDir)//la
                break;
            else
                troca(PonteiroEsq,PonteiroDir);
        }
        troca(PonteiroEsq, dir);
        return PonteiroEsq;
    }
    
    public void ordenacaoQuickSortIdade(int esq, int dir){
        TReg[] vetor = vetorDados.getVetorDados();
        if(dir-esq <= 0)                //se tamanho <= 1
            return;                     //ja ordenado
        else{                           //tamanho 2 ou maior
            int pivo = vetor[dir].idade;      //item mais a direita
            int particao = particionarIdade(esq, dir, pivo);
            ordenacaoQuickSortIdade(esq, particao-1);
            ordenacaoQuickSortIdade(particao+1, dir);
        }
    }
}
