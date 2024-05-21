package br.edu.up.controller;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.model.Cliente;

public class ClienteController {

  private List<Cliente> clientes;

  public ClienteController() {
    this.clientes = new ArrayList<>();
  }

  public void setCliente(Cliente cliente) {
    this.clientes.add(cliente);
  }

  public Cliente getCliente(String nome) {
    for (Cliente cliente : clientes) {
      if (cliente.getNome().equals(nome)) {
        return cliente;
      }
    }
    return null;
  }

  public Double devolver(Double valor) {
    return 0.0;
  }

  public List<Cliente> getClientes() {
    return this.clientes;
  }
}
