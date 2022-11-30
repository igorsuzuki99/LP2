package br.gov.fatec.rec.Seguradora.controller;

import br.gov.fatec.rec.Seguradora.model.SeguroAuto;
import br.gov.fatec.rec.Seguradora.service.SeguroAutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Controller
public class AutoController {

    private SeguroAutoService autoService;
    public AutoController(SeguroAutoService autoService){
        this.autoService = autoService;
    }

    @PostMapping(value = "/cadastrarAuto")
    public ResponseEntity<SeguroAuto> criarAuto(@RequestBody SeguroAuto seguroAuto){
        return ResponseEntity.status(201).body(autoService.criarAuto(seguroAuto));
    }

    @GetMapping(value = "/listarAuto")
    public ResponseEntity<List<SeguroAuto>> listaAuto(){
        return ResponseEntity.status(200).body(autoService.listarAuto());

    }
}
