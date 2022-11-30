package br.gov.fatec.rec.Seguradora.model;

import jakarta.persistence.*;

@Entity
@Table(name = "seguroauto")
public class SeguroAuto extends Seguro{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name="deducaoautomovel")
    private int deducaoAutomovel;
    @Column(name = "numlicenca")
    private int numLicenca;
    @Column(name = "estado")
    private String estado;
    @Column(name = "modelo")
    private String modelo;
    @Column(name = "ano")
    private int ano;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getDeducaoAutomovel() {
        return deducaoAutomovel;
    }

    public void setDeducaoAutomovel(int deducaoAutomovel) {
        this.deducaoAutomovel = deducaoAutomovel;
    }

    public int getNumLicenca() {
        return numLicenca;
    }

    public void setNumLicenca(int numLicenca) {
        this.numLicenca = numLicenca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String imprimirSeguro() {
        return null;
    }
}
