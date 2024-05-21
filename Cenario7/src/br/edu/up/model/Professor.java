package br.edu.up.model;

public class Professor extends Pessoa7 {
  private String idcLattes;
  private Curriculo curriculo;

  public String getIdcLattes() {
    return this.idcLattes;
  }

  public void setIdcLattes(String idcLattes) {
    this.idcLattes = idcLattes;
  }

  public Curriculo getCurriculo() {
    return this.curriculo;
  }

  public void setCurriculo(Curriculo curriculo) {
    this.curriculo = curriculo;
  }
}