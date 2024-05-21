package br.edu.up.model;

import java.util.List;

public class Disciplina {
  private String nome;
  private String identificador;
  private Curriculo curriculo;
  private List<Competencia> competencias;
  private List<Aluno> alunos;
  private Professor professor;
  private boolean necessario = true;

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getIdentificador() {
    return this.identificador;
  }

  public void setIdentificador(String identificador) {
    this.identificador = identificador;
  }

  public Curriculo getCurriculo() {
    return this.curriculo;
  }

  public void setCurriculo(Curriculo curriculo) {
    this.curriculo = curriculo;
  }

  public List<Competencia> getCompetencias() {
    return this.competencias;
  }

  public void setCompetencias(List<Competencia> competencias) {
    this.competencias = competencias;
  }

  public List<Aluno> getAlunos() {
    return this.alunos;
  }

  public void setAlunos(List<Aluno> alunos) {
    this.alunos = alunos;
  }

  public Professor getProfessor() {
    return this.professor;
  }

  public void setProfessor(Professor professor) {
    this.professor = professor;
  }

  public boolean isNecessario() {
    return this.necessario;
  }

  public boolean getNecessario() {
    return this.necessario;
  }

  public void setNecessario(boolean necessario) {
    this.necessario = necessario;
  }
}