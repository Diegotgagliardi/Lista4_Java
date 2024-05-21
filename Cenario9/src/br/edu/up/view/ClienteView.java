package br.edu.up.view;

import java.util.Scanner;

import br.edu.up.controller.ClienteController;
import br.edu.up.model.*;

public class ClienteView {

  private Scanner scanner;
  private ClienteController cliente;

  public ClienteView() {
    this.scanner = new Scanner(System.in);
    this.cliente = new ClienteController();

  }

  public void iniciar() {
    while (true) {
      System.out.println("1.  Incluir cliente pessoa");
      System.out.println("2.  Incluir cliente empresa");
      System.out.println("3.  Mostrar dados cliente pessoa");
      System.out.println("4.  Mostrar dados cliente empresa");
      System.out.println("5.  Emprestar para cliente pessoa");
      System.out.println("6.  Emprestar para cliente empresa");
      System.out.println("7.  Devolução de cliente pessoa ");
      System.out.println("8.  Devolução de cliente empresa");
      System.out.println("9.  Sair");
      String opcao = scanner.next();
      scanner.nextLine();
      switch (opcao) {
        case "1":
          incluirClientePessoa();
          break;
        case "2":
          incluirClienteEmpresa();
          break;
        case "3":
          MostrarDadosClientePessoa();
          break;
        case "4":
          MostrarDadosClienteEmpresa();
          break;
        case "5":
          System.out.println("Qual o nome?");
          EmprestarParaCliente(scanner.nextLine());
          break;
        case "6":
          System.out.println("Qual o nome?");
          EmprestarParaCliente(scanner.nextLine());
          break;
        case "7":
          System.out.println("Qual o nome?");
          DevoluçãoDeCliente(scanner.nextLine());
          break;
        case "8":
          System.out.println("Qual o nome?");
          DevoluçãoDeCliente(scanner.nextLine());
          break;
        case "9":
          return;
        default:
          break;
      }
    }
  }

  public void incluirClientePessoa() {
    ClientePessoa cliente = new ClientePessoa();
    System.out.println("Qual seu nome?");
    cliente.setNome(scanner.nextLine());
    System.out.println("Qual seu telefone?");
    cliente.setTelefone(scanner.nextLine());
    System.out.println("Qual seu email?");
    cliente.setEmail(scanner.nextLine());
    System.out.println("Qual seu endereço?");
    cliente.setEndereco(scanner.nextLine());
    System.out.println("Qual o valor máximo de crédito?");
    cliente.setVlrMaximoCredito(scanner.nextDouble());
    scanner.nextLine();
    System.out.println("Qual seu peso?");
    cliente.setPeso(scanner.nextDouble());
    scanner.nextLine();
    System.out.println("Qual sua altura?");
    cliente.setAltura(scanner.nextDouble());
    scanner.nextLine();
    System.out.println("Qual seu CPF?");
    cliente.setCPF(scanner.nextLine());
    this.cliente.setCliente(cliente);

  }

  public void incluirClienteEmpresa() {
    ClienteEmpresa cliente = new ClienteEmpresa();
    System.out.println("Qual o nome da empresa?");
    cliente.setNome(scanner.nextLine());
    System.out.println("Qual o telefone da empresa?");
    cliente.setTelefone(scanner.nextLine());
    System.out.println("Qual o email da empresa?");
    cliente.setEmail(scanner.nextLine());
    System.out.println("Qual o endereço da empresa?");
    cliente.setEndereco(scanner.nextLine());
    System.out.println("Qual o valor máximo de crédito?");
    cliente.setVlrMaximoCredito(scanner.nextDouble());
    scanner.nextLine();
    System.out.println("Qual o ano de fundação da empresa?");
    cliente.setAnoFundacao(scanner.nextInt());
    scanner.nextLine();
    System.out.println("Qual a inscrição estadual da empresa?");
    cliente.setInscEstadual(scanner.nextLine());
    System.out.println("Qual o CNPJ da empresa?");
    cliente.setCnpj(scanner.nextLine());
    this.cliente.setCliente(cliente);

  }

  public void MostrarDadosClientePessoa() {
    for (Cliente cliente : this.cliente.getClientes()) {
      if (cliente instanceof ClientePessoa) {
        ClientePessoa clientePessoa = (ClientePessoa) cliente;
        System.out.println(clientePessoa.toString());
      }
    }
  }

  public void MostrarDadosClienteEmpresa() {
    for (Cliente cliente : this.cliente.getClientes()) {
      if (cliente instanceof ClienteEmpresa) {
        ClienteEmpresa clienteEmpresa = (ClienteEmpresa) cliente;
        System.out.println(clienteEmpresa.toString());
      }
    }

  }

  public String EmprestarParaCliente(String nome) {
    Cliente cli = cliente.getCliente(nome);
    if (cli == null) {
      return "Invalido";
    }
    System.out.println("O valor máximo pra enprestimo é: ");
    System.out.println(cli.getVlrMaximoCredito());
    System.out.println();
    System.out.println("Quanto quer emprestado");
    double valor = scanner.nextDouble();

    if (cli.getVlrMaximoCredito() <= valor || valor < 0) {
      cli.setVlrEmprestado(valor);
      cli.setVlrMaximoCredito(cli.getVlrMaximoCredito() - valor);
      return "emprestimo efetivado";
    }
    return "emprestimo invalido, sem credito liberado";
  }

  public String DevoluçãoDeCliente(String nome) {
    Cliente cli = cliente.getCliente(nome);
    if (cli == null) {
      return "Invalido";
    }
    System.out.println("O valor emprestado é: ");
    System.out.println(cli.getVlrEmprestado());
    System.out.println();
    System.out.println("Quanto quer pagar?");
    double valor = scanner.nextDouble();
    if (cli.getVlrEmprestado() <= valor || valor < 0) {
      cli.setVlrMaximoCredito(valor + cli.getVlrMaximoCredito());
      return "você tem um credito de " + cli.getVlrMaximoCredito();
    }
    return "Valor invalido";

  }

  public Endereco setEndereço() {
    Cidade cidade = new Cidade();
    Endereco endereco = new Endereco(cidade);
    System.out.println("Qual cidade");
    cidade.setNome(scanner.nextLine());
    System.out.println("Qual Estado");
    cidade.setUf(scanner.nextLine());
    System.out.println("qual sua rua?");
    endereco.setRua(scanner.nextLine());
    System.out.println("numero");
    endereco.setNumero(scanner.nextLine());
    System.out.println("Bairro");
    endereco.setBairro(scanner.nextLine());
    System.out.println("CEP");
    endereco.setCep(scanner.nextLine());
    return endereco;
  }

}
