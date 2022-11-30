package br.gov.fatec.rec.Seguradora.model;

import jakarta.persistence.*;

@Entity
@Table(name = "data")
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "dia")
    private int dia;
    @Column(name = "mes")
    private int mes;
    @Column(name = "ano")
    private int ano;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void imprimirData(){
        System.out.println("Data: "+getDia()+"/"+getMes()+"/"+getAno());
    }
}
