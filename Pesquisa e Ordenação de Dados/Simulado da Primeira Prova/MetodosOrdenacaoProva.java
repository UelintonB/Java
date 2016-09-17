/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patrickAndreiCaronGuerra;

/**
 *
 * @author Patrick Guerra
 */
public class MetodosOrdenacaoProva {
    VetorProva vetorDados;

    public MetodosOrdenacaoProva(VetorProva vetorDados) {
        this.vetorDados = vetorDados;
    }
    
    public void troca(int a, int b){
        DadosProva[] vetor = vetorDados.getVetorDados();
        DadosProva aux = vetor[a];
        vetor[a] = vetor[b];
        vetor[b] = aux;
    }    
    
    public int particionarValor(int esq, int dir, double pivo){
        DadosProva[] vetor = vetorDados.getVetorDados();
        int PonteiroEsq = esq-1;
        int PonteiroDir = dir;
        while(true){
            while(vetor[++PonteiroEsq].getValor() > pivo)//crescente <
                ;
            while(PonteiroDir > 0 && vetor[--PonteiroDir].getValor() < pivo)//crescente >
                ;
            if(PonteiroEsq >= PonteiroDir)
                break;
            else
                troca(PonteiroEsq,PonteiroDir);
        }
        troca(PonteiroEsq, dir);
        return PonteiroEsq;
    }   
    
    public void ordenacaoPorValorQuickSortDecrescente(int esq, int dir){
        DadosProva[] vetor = vetorDados.getVetorDados();
        if(dir-esq <= 0)                //se tamanho <= 1
            return;                     //ja ordenado
        else{                           //tamanho 2 ou maior
            double pivo = vetor[dir].getValor();      //item mais a direita
            int particao = particionarValor(esq, dir, pivo);
            ordenacaoPorValorQuickSortDecrescente(esq, particao-1);
            ordenacaoPorValorQuickSortDecrescente(particao+1, dir);
        }
    }
    
    public int particionarDistancia(int esq, int dir, int pivo){
        DadosProva[] vetor = vetorDados.getVetorDados();
        int PonteiroEsq = esq-1;
        int PonteiroDir = dir;
        while(true){
            while(vetor[++PonteiroEsq].getDistancia() < pivo)//crescente <
                ;
            while(PonteiroDir > 0 && vetor[--PonteiroDir].getDistancia() > pivo)//crescente >
                ;
            if(PonteiroEsq >= PonteiroDir)
                break;
            else
                troca(PonteiroEsq,PonteiroDir);
        }
        troca(PonteiroEsq, dir);
        return PonteiroEsq;
    }   
    
    public void ordenacaoPorDistanciaQuickSortCrescente(int esq, int dir){
        DadosProva[] vetor = vetorDados.getVetorDados();
        if(dir-esq <= 0)                //se tamanho <= 1
            return;                     //ja ordenado
        else{                           //tamanho 2 ou maior
            int pivo = vetor[dir].getDistancia();      //item mais a direita
            int particao = particionarDistancia(esq, dir, pivo);
            ordenacaoPorDistanciaQuickSortCrescente(esq, particao-1);
            ordenacaoPorDistanciaQuickSortCrescente(particao+1, dir);
        }
    }
    
    public void ordenacaoPorCategorias(){
       //DadosProva[] vetor = vetorDados.getVetorDados
       int i,c=-1;
        ordenacaoPorDistanciaQuickSortCrescente(0, vetorDados.numElementosInseridos-1);
        for(i=0;i<vetorDados.numElementosInseridos;i++){
            if(vetorDados.getValorByID(i).getDistancia()<=100)
                c=i;
            else
                break;
        }
        ordenacaoPorValorQuickSortDecrescente(++c, vetorDados.getNumElementosInseridos()-1);
        for(i=0;i<vetorDados.numElementosInseridos;i++){
            if(vetorDados.getValorByID(i).getValor()>=300.00)
                c=i;
            else
                break;
        }
        ordenacaoPorDistanciaQuickSortCrescente(++c, vetorDados.numElementosInseridos-1);
    }
}
