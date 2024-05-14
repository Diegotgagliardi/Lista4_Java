package br.edu.up.model;

public class Estacionamento {
    private int vagas;
    private final double valorPeriodo = 5.0;
    private double caixa;

    public Estacionamento(int vagas) {
        this.vagas = vagas;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public double getValorPeriodo() {
        return valorPeriodo;
    }

    public double getCaixa() {
        return caixa;
    }

    public void setCaixa(double caixa) {
        this.caixa = caixa;
    }
}