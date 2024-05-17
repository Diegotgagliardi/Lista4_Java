package br.edu.up.model;

public class SeguroVida extends Seguro {
    private boolean cobreDoenca;
    private boolean cobreAcidente;

    public boolean isCobreDoenca() {
        return cobreDoenca;
    }

    public void setCobreDoenca(boolean cobreDoenca) {
        this.cobreDoenca = cobreDoenca;
    }

    public boolean isCobreAcidente() {
        return cobreAcidente;
    }

    public void setCobreAcidente(boolean cobreAcidente) {
        this.cobreAcidente = cobreAcidente;
    }

    @Override
    public String getDados() {
        return "Dados do Seguro de Vida: " +
                "\nApolice: " + getApolice() +
                "\nSegurado: " + getSegurado() +
                "\nValor da Apolice: " + getVrApolice() +
                "\nData de Inicio: " + getDtInicio() +
                "\nData de Fim: " + getDtFim() +
                "\nCobre Doença: " + isCobreDoenca() +
                "\nCobre Acidente: " + isCobreAcidente();
    }
}