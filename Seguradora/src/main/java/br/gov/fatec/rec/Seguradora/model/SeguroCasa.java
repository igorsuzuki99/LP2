package br.gov.fatec.rec.Seguradora.model;

public class SeguroCasa extends Seguro{

    private int deducaoCasa;
    private int anoConstrucao;


    public int getDeducaoCasa() {
        return deducaoCasa;
    }

    public void setDeducaoCasa(int deducaoCasa) {
        this.deducaoCasa = deducaoCasa;
    }

    public int getAnoConstrucao() {
        return anoConstrucao;
    }

    public void setAnoConstrucao(int anoConstrucao) {
        this.anoConstrucao = anoConstrucao;
    }

    @Override
    public String imprimirSeguro() {
        return null;
    }
}
