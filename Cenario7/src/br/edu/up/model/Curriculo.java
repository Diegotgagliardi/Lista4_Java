package br.edu.up.model;

public class Curriculo {
  private String nomeTitulo;
  private String instituicao;
  private String anoComclusao;
  private String ttc;

  public String getNomeTitulo() {
    return nomeTitulo;
  }

  public void setNomeTitulo(String nomeTitulo) {
    this.nomeTitulo = nomeTitulo;
  }

  public String getInstituicao() {
    return instituicao;
  }

  public void setInstituicao(String instituicao) {
    this.instituicao = instituicao;
  }

  public String getAnoComclusao() {
    return anoComclusao;
  }

  public void setAnoComclusao(String anoComclusao) {
    this.anoComclusao = anoComclusao;
  }

  public String getTtc() {
    return ttc;
  }

  public void setTtc(String ttc) {
    this.ttc = ttc;
  }

}