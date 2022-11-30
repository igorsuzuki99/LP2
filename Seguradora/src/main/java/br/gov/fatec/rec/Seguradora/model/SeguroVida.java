package br.gov.fatec.rec.Seguradora.model;

public class SeguroVida extends Seguro{

    private String beneficiario;
    private Data datanasc;

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public Data getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(Data datanasc) {
        this.datanasc = datanasc;
    }

    @Override
    public String imprimirSeguro() {
        return null;
    }
}
