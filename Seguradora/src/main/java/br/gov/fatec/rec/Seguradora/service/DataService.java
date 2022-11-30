package br.gov.fatec.rec.Seguradora.service;

import br.gov.fatec.rec.Seguradora.model.Data;
import br.gov.fatec.rec.Seguradora.repository.IData;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DataService {
    private IData repository;

    public DataService(IData repository){
        this.repository = repository;
    }

    public List<Data> listarData(){
        List<Data> lista = repository.findAll();
        return lista;
    }

    public Data criarData (Data data){
        Data dataNova = repository.save(data);
        return dataNova;
    }
}
