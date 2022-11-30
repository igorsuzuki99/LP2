package br.gov.fatec.rec.Seguradora.controller;

import br.gov.fatec.rec.Seguradora.model.Data;
import br.gov.fatec.rec.Seguradora.service.DataService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    private DataService dataService;
    public DataController(DataService dataService){
        this.dataService = dataService;
    }

    @PostMapping(value = "/cadastrarData")
    public ResponseEntity<Data> criarData(@RequestBody Data data){
        return ResponseEntity.status(201).body(dataService.criarData(data));
    }
}
