package br.gov.fatec.rec.Seguradora.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class Imports {

    @GetMapping(value="/css/styles.css")
    public ModelAndView css() {
        ModelAndView andView = new ModelAndView("css/styles.css");
        return andView;
    }

    @GetMapping(value="/js/script.js")
    public ModelAndView js() {
        ModelAndView andView = new ModelAndView("js/script.js");
        return andView;
    }
}
