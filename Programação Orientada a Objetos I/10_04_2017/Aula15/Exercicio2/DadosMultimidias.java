/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aula15_exe2_patrickacguerra;

/**
 *
 * @author Patrick Guerra
 */
public class DadosMultimidias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**Inserindo CDs e DVDs predefinidos*/
        Database base = new Database();
        CD cd1 = new CD();
        cd1.setCD("Prism","Katy Perry", 13, 48);
        cd1.setComment("Good");
        base.addItem(cd1);
        
        CD cd2 = new CD();
        cd2.setCD("V", "Maroon 5", 11, 40);
        cd2.setComment("Good");
        base.addItem(cd2);
        
        DVD dvd1 = new DVD();
        dvd1.setDVD("Need for Speed", "Scott Waugh", 130);
        dvd1.setComment("Good");
        base.addItem(dvd1);
        
        DVD dvd2 = new DVD();
        dvd2.setDVD("Harry Potter e a Camara Secreta", "Chris Columbus", 161);
        dvd2.setComment("Good");
        base.addItem(dvd2);
        
        LeituraTeclado input = new LeituraTeclado();
        int opcao = -1;
        while(opcao != 0){
            System.out.printf("\nDados Multimidia - Patrick A. C. Guerra\n-> Opcoes:\n\t1- Cadastrar\n");
            System.out.printf("\t2- Listar CDs e DVDs\n\t3- Pesquisar por Titulo \n\t0- Sair\n-> Digite uma opcao: ");
            switch(opcao = Integer.parseInt(input.getEntrada("")) ){
                case 1:
                    System.out.printf("Cadastro de Itens Multimidia:\nDigite:\n");
                    int opcaoMulti = Integer.parseInt(input.getEntrada("1 para CD ou 2 para DVD:"));
                    if(opcaoMulti == 1){
                        CD cdTmp = new CD();
                        cdTmp.setCD(
                            input.getEntrada("-> Titulo:"),
                            input.getEntrada("-> Artista:"),
                            Integer.parseInt(input.getEntrada("-> Numero de Faixas:")),
                            Integer.parseInt(input.getEntrada("-> Tempo:"))
                        );
                        cdTmp.setComment(input.getEntrada("-> Comentario:"));
                        base.addItem(cdTmp);
                        System.out.println("CD cadastrado com sucesso!");
                    }else if(opcaoMulti == 2){
                        DVD dvdTmp = new DVD();
                        dvdTmp.setDVD(
                            input.getEntrada("-> Titulo:"),
                            input.getEntrada("-> Diretor:"),
                            Integer.parseInt(input.getEntrada("-> Tempo:"))
                        );
                        dvdTmp.setComment(input.getEntrada("-> Comentario:"));
                        base.addItem(dvdTmp);
                        System.out.println("DVD cadastrado com sucesso!");
                    }
                    break;
                case 2:
                    System.out.println("Itens cadastrados: ");
                    base.list(); 
                    break;
                case 3:
                    Item tmpItem = base.pesqPorItem(input.getEntrada("Digite o titulo:"));
                    if(tmpItem == null)
                        System.out.println("Titulo nao encontrado!");
                    else
                        tmpItem.print();
                    break;
                default:
                    break;
            }
        }
    }

}
