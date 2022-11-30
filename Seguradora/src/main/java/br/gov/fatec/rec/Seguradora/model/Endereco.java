package br.gov.fatec.rec.Seguradora.model;

public class Endereco {
    private String enderecoCompleto;
    private String cidade;
    private String estado;
    private String cep;

    public String getEnderecoCompleto() {
        return enderecoCompleto;
    }

    public void setEnderecoCompleto(String enderecoCompleto) {
        this.enderecoCompleto = enderecoCompleto;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void imprimirEndereço(){
        System.out.println("Endereço: "+getEnderecoCompleto());
    }
}
