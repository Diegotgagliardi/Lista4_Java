package br.edu.up.model;

public abstract class Servico {
  protected String nome;
  protected String data;
  protected double valor;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  @Override
  public String toString() {
    return "Servico [nome=" + nome + ", data=" + data + ", valor=" + valor + "]";
  }
}