package br.edu.up.model;

public abstract class Cliente {

  protected String nome;
  protected String telefone;
  protected String email;
  protected String endereco;
  protected Double vlrMaximoCredito;
  protected Double vlrEmprestado;

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Double getVlrMaximoCredito() {
    return this.vlrMaximoCredito;
  }

  public void setVlrMaximoCredito(Double vlrMaximoCredito) {
    this.vlrMaximoCredito = vlrMaximoCredito;
  }

  public Double getVlrEmprestado() {
    return this.vlrEmprestado;
  }

  public void setVlrEmprestado(Double vlrEmprestado) {
    this.vlrEmprestado = vlrEmprestado;
  }

  public String getTelefone() {
    return this.telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEndereco() {
    return this.endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public Double getSaldo() {
    return 0.0;
  }

  @Override
  public String toString() {
    return "\n" +
        "  \"nome\": \"" + nome + "\",\n" +
        "  \"telefone\": \"" + telefone + "\",\n" +
        "  \"email\": \"" + email + "\",\n" +
        "  \"endereço\": \"" + endereco + "\",\n" +
        "  \"vlrMaximoCredito\": \"" + vlrMaximoCredito + "\",\n" +
        "  \"vlrEmprestado\": \"" + vlrEmprestado + "\",\n" +
        "";
  }
}