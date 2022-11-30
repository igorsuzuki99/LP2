package br.gov.fatec.rec.Seguradora.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

}
