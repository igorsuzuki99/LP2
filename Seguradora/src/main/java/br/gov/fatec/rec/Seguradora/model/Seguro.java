package br.gov.fatec.rec.Seguradora.model;

import jakarta.persistence.*;

public abstract class Seguro {

    private Integer id;

    private int numApolice;

    private String nome;

    private Endereco endereco;
    private float valor;
    private float premio;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumApolice() {
        return numApolice;
    }

    public void setNumApolice(int numApolice) {
        this.numApolice = numApolice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getPremio() {
        return premio;
    }

    public void setPremio(float premio) {
        this.premio = premio;
    }

    public abstract String imprimirSeguro();
}
