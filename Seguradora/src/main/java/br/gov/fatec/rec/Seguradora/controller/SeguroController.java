package br.gov.fatec.rec.Seguradora.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SeguroController {


    @GetMapping(value="/vida")
    public ModelAndView vida() {
        ModelAndView andView = new ModelAndView("vida.html");
        return andView;
    }

    @GetMapping(value="/casa")
    public ModelAndView casa() {
        ModelAndView andView = new ModelAndView("casa.html");
        return andView;
    }

    @GetMapping(value="/auto")
    public ModelAndView auto() {
        ModelAndView andView = new ModelAndView("auto.html");
        return andView;
    }

    @GetMapping(value = "/listarseguros")
    public ModelAndView listaSeguros(){
        ModelAndView andView = new ModelAndView("listaSeguros.html");
        return andView;
    }

//    @GetMapping(value = "/seguros")
//    public ResponseEntity<List<Seguro>> listaSeguro(){
//        return ResponseEntity.status(200).body(seguroService.listarSeguro());
//
//    }

//    @PostMapping(value = "/cadastrarSeguro")
//    public ResponseEntity<Seguro> criarSeguro(@RequestBody Seguro seguro){
//        return ResponseEntity.status(201).body(seguroService.criarSeguro(seguro));
//    }


}
