package br.edu.up.controller;

import br.edu.up.model.*;

public class ServControl {

  private Servico[] servicos;
  private int lotacao;

  public ServControl() {
    this.servicos = new Servico[10];
    this.lotacao = 0;
  }

  public Servico[] getServicos() {
    return this.servicos;
  }

  public Servico getServico(String nome) {
    for (Servico servico : this.servicos) {
      if (servico != null && servico.getNome().equals(nome)) {
        return servico;
      }
    }
    return null;
  }

  public void setEvento(String nome, String data, String local, int lotacaoMaxima, int qtdeIngressosVendidos,
      double precoIngresso) {
    if (lotacao < servicos.length) {
      servicos[this.lotacao++] = new Evento(nome, data, local, lotacaoMaxima, qtdeIngressosVendidos, precoIngresso);
    } else {
      System.out.println("Capacidade máxima de serviços atingida.");
    }
  }

  public void setReserva(String nome, String data, String nomeResponsavel, double valor, int qtdePessoas) {
    if (lotacao < servicos.length) {
      servicos[this.lotacao++] = new Reserva(nome, data, nomeResponsavel, valor, qtdePessoas);
    } else {
      System.out.println("Capacidade máxima de serviços atingida.");
    }
  }

  public boolean verificarEvento(String nome) {
    for (int i = 0; i < lotacao; i++) {
      if (servicos[i] != null && servicos[i].getNome().equals(nome)) {
        return true;
      }
    }
    return false;
  }

  public void excluirEvento(String nome) {
    for (int i = 0; i < lotacao; i++) {
      if (servicos[i] != null && servicos[i].getNome().equals(nome)) {
        servicos[i] = null;

        for (int j = i; j < lotacao - 1; j++) {
          servicos[j] = servicos[j + 1];
        }
        servicos[--lotacao] = null;
        break;
      }
    }
  }
}
