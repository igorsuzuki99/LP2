package br.gov.fatec.rec.Seguradora.repository;

import br.gov.fatec.rec.Seguradora.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IData extends JpaRepository<Data, Integer> {
}
