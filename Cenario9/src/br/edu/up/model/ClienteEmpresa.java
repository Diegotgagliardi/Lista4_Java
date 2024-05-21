package br.edu.up.model;

public class ClienteEmpresa extends Cliente {

  private int anoFundacao;
  private String inscEstadual;
  private String cnpj;

  public String getInscEstadual() {
    return this.inscEstadual;
  }

  public void setInscEstadual(String inscEstadual) {
    this.inscEstadual = inscEstadual;
  }

  public String getCnpj() {
    return this.cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public int getAnoFundacao() {
    return this.anoFundacao;
  }

  public void setAnoFundacao(int anoFundacao) {
    this.anoFundacao = anoFundacao;
  }

  public String toString() {
    return "{\n" +
        "  \"nome\": \"" + nome + "\",\n" +
        "  \"telefone\": \"" + telefone + "\",\n" +
        "  \"email\": \"" + email + "\",\n" +
        "  \"endereço\": \"" + endereco.toString() + "\",\n" +
        "  \"vlrMaximoCredito\": \"" + vlrMaximoCredito + "\",\n" +
        "  \"vlrEmprestado\": \"" + vlrEmprestado + "\",\n" +
        "  \"anoFundacao\": \"" + anoFundacao + "\",\n" +
        "  \"inscEstadual\": \"" + inscEstadual + "\",\n" +
        "  \"cnpj\": \"" + cnpj + "\"\n" +
        "}";
  }
}
