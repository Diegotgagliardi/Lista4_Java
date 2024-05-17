package br.edu.up.model;

public class SeguroVeiculo extends Seguro {
    private double vrFranquia;
    private boolean temCarroReserva;
    private boolean cobreVidros;

    public double getVrFranquia() {
        return vrFranquia;
    }

    public void setVrFranquia(double vrFranquia) {
        this.vrFranquia = vrFranquia;
    }

    public boolean isTemCarroReserva() {
        return temCarroReserva;
    }

    public void setTemCarroReserva(boolean temCarroReserva) {
        this.temCarroReserva = temCarroReserva;
    }

    public boolean isCobreVidros() {
        return cobreVidros;
    }

    public void setCobreVidros(boolean cobreVidros) {
        this.cobreVidros = cobreVidros;
    }

    @Override
    public String getDados() {
        return "Dados do Seguro de Veiculo: " +
                "\nApolice: " + getApolice() +
                "\nSegurado: " + getSegurado() +
                "\nValor da Apolice: " + getVrApolice() +
                "\nData de Inicio: " + getDtInicio() +
                "\nData de Fim: " + getDtFim() +
                "\nValor da Franquia: " + getVrFranquia() +
                "\nTem Carro Reserva: " + isTemCarroReserva() +
                "\nCobre Vidros: " + isCobreVidros();
    }
}