package br.gov.fatec.rec.Seguradora.service;

import br.gov.fatec.rec.Seguradora.model.SeguroAuto;
import br.gov.fatec.rec.Seguradora.repository.ISeguroAuto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeguroAutoService {
    private ISeguroAuto autorepository;

    public SeguroAutoService(ISeguroAuto autorepository){
        this.autorepository = autorepository;
    }

    public List<SeguroAuto> listarAuto(){
        List<SeguroAuto> lista = autorepository.findAll();
        return lista;
    }

    public SeguroAuto criarAuto (SeguroAuto seguroAuto){
        SeguroAuto autoNovo = autorepository.save(seguroAuto);
        return autoNovo;
    }

}
