package br.edu.up.model;

public class Aluno extends Pessoa7 {
  private String anoInicio;
  private String curso;
  private String turno;

  public String getAnoInicio() {
    return anoInicio;
  }

  public void setAnoInicio(String anoInicio) {
    this.anoInicio = anoInicio;
  }

  public String getCurso() {
    return curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public String getTurno() {
    return turno;
  }

  public void setTurno(String turno) {
    this.turno = turno;
  }

}