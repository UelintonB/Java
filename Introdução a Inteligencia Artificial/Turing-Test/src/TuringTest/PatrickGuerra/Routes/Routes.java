/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TuringTest.PatrickGuerra.Routes;

import TuringTest.PatrickGuerra.Controllers.*;
import TuringTest.PatrickGuerra.Views.*;

/**
 *
 * @author Patrick Guerra
 */
public class Routes {
    Controller controller;
    public Routes() {
        controller = new Controller();
        controller.inserirChave("ola");
        controller.inserirResposta("ola", "oi, tudo bem?");
        controller.inserirChave("oi");
        controller.inserirResposta("oi", "ola");
        controller.inserirResposta("oi", "oi tudo bem?");
        controller.inserirChave("tchau");
        controller.inserirResposta("tchau", "muito bem, ate mais");
        controller.inserirResposta("tchau", "ate logo");
        controller.inserirChave("ate");
        controller.inserirResposta("ate", "ate mais");
        controller.inserirResposta("ate", "ate logo");
        controller.inserirChave("bem");
        controller.inserirResposta("bem", "legal");
        controller.inserirResposta("bem", "muito bom");
        controller.inserirChave("sim");
        controller.inserirResposta("sim", "certamente");
        controller.inserirResposta("sim", "afirmativo");
        controller.inserirChave("nome");
        controller.inserirResposta("nome", "meu nome e Arian");
        controller.inserirChave("ano");
        controller.inserirResposta("ano", "gosto do ano de 2018");
        //controller.inserirChave("data");
        //controller.inserirChave("dia");
        //controller.inserirChave("hora");
    }
    
    public void inicial(){
        //Exibicao view = new Exibicao("inicial", null);
        //view = null;
        //System.gc();
        escolheOpcao();
    }
    
    public void escolheOpcao(){
        Entrada view = new Entrada(this.controller);
        view.escolheOpcao();
    }

}
