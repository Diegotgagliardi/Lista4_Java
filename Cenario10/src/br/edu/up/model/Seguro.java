package br.edu.up.model;

import java.time.LocalDate;

public abstract class Seguro {
    private String apolice;
    private String segurado;
    private double vrApolice;
    private LocalDate dtInicio;
    private LocalDate dtFim;

    public String getApolice() {
        return apolice;
    }

    public void setApolice(String apolice) {
        this.apolice = apolice;
    }

    public String getSegurado() {
        return segurado;
    }

    public void setSegurado(String segurado) {
        this.segurado = segurado;
    }

    public double getVrApolice() {
        return vrApolice;
    }

    public void setVrApolice(double vrApolice) {
        this.vrApolice = vrApolice;
    }

    public LocalDate getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(LocalDate dtInicio) {
        this.dtInicio = dtInicio;
    }

    public LocalDate getDtFim() {
        return dtFim;
    }

    public void setDtFim(LocalDate dtFim) {
        this.dtFim = dtFim;
    }

    public abstract String getDados();
}