package br.edu.up.view;

import java.util.Scanner;
import br.edu.up.controller.*;
import br.edu.up.model.*;

public class MenuOp5 {

  private ServControl e_control;
  private Scanner scanner;

  public MenuOp5() {
    this.e_control = new ServControl();
    this.scanner = new Scanner(System.in);
  }

  public void mostrarMenu5() {
    while (true) {
      System.out.println("Deseja falar sobre evento ou reserva?");
      System.out.println("1 - reserva 2 - evento");
      String nome = (scanner.nextInt() == 1) ? "reserva" : "evento";

      System.out.println("Selecione uma opção:");
      System.out.println("1. Incluir " + nome);
      System.out.println("2. Alterar " + nome);
      System.out.println("3. Listar " + nome);
      System.out.println("4. Excluir " + nome);
      System.out.println("5. Sair");
      int op = scanner.nextInt();
      scanner.nextLine();

      switch (op) {
        case 1:
          System.out.println(incluirEvento(nome));
          break;
        case 2:
          System.out.println(alterarServico(nome));
          break;
        case 3:
          listarServicos(nome);
          break;
        case 4:
          System.out.println(excluirEvento(nome));
          break;
        case 5:
          return;
        default:
          System.out.println("Opção invalida");
          break;
      }
    }
  }

  public String incluirEvento(String servico) {
    System.out.println("Digite o nome do " + servico + ":");
    String nome = scanner.nextLine();

    if (!this.e_control.verificarEvento(nome)) {
      if (servico.equals("evento")) {
        System.out.println("Digite a data do evento no formato (dd/mm/aaaa):");
        String data = scanner.nextLine();
        System.out.println("Digite o local do evento:");
        String local = scanner.nextLine();
        System.out.println("Qual é a lotação máxima do evento?");
        int lotacaoMaxima = scanner.nextInt();
        System.out.println("Digite a quantidade de ingressos vendidos:");
        int qtdeIngressosVendidos = scanner.nextInt();
        System.out.println("Qual é o valor do ingresso?");
        double precoIngresso = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha
        this.e_control.setEvento(nome, data, local, lotacaoMaxima, qtdeIngressosVendidos, precoIngresso);
        return "Evento criado.";
      } else if (servico.equals("reserva")) {
        System.out.println("Qual a data da reserva?");
        String data = scanner.nextLine();
        System.out.println("Qual o nome do responsável?");
        String nomeResponsavel = scanner.nextLine();
        System.out.println("Qual valor da reserva?");
        double valor = scanner.nextDouble();
        System.out.println("Quantas pessoas para sua reserva?");
        int qtdePessoas = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha
        this.e_control.setReserva(nome, data, nomeResponsavel, valor, qtdePessoas);
        return "Reserva criada.";
      }
    }
    return "Este serviço já existe.";
  }

  public String alterarServico(String servi) {
    System.out.println("Digite o nome do " + servi + " a ser alterado:");
    String nome = scanner.nextLine();
    Servico serv = this.e_control.getServico(nome);

    if (serv == null) {
      return "Serviço não encontrado.";
    }

    if ((servi.equals("reserva") && serv instanceof Evento) || (servi.equals("evento") && serv instanceof Reserva)) {
      return "Você um nome de outro serviço.";
    }

    boolean b = true;
    while (b) {
      System.out.println("Deseja alterar qual informação?");
      if (serv instanceof Reserva) {
        Reserva reserva = (Reserva) serv;
        System.out.println("1 - Nome");
        System.out.println("2 - Data");
        System.out.println("3 - Responsável");
        System.out.println("4 - Quantidade de pessoas");
        System.out.println("5 - Valor");
        System.out.println("6 - Sair");

        int opcao = scanner.nextInt();
        scanner.nextLine();
        switch (opcao) {
          case 1:
            System.out.println("Digite o novo nome:");
            reserva.setNome(scanner.nextLine());
            break;
          case 2:
            System.out.println("Digite a nova data:");
            reserva.setData(scanner.nextLine());
            break;
          case 3:
            System.out.println("Digite o novo responsável:");
            reserva.setNomeResponsavel(scanner.nextLine());
            break;
          case 4:
            System.out.println("Digite a nova quantidade de pessoas:");
            reserva.setQtdePessoas(scanner.nextInt());
            scanner.nextLine();
            break;
          case 5:
            System.out.println("Digite o novo valor:");
            reserva.setValor(scanner.nextDouble());
            scanner.nextLine();
            break;
          case 6:
            b = false;
            break;
          default:
            System.out.println("Opção inválida!");
            break;
        }
      } else if (serv instanceof Evento) {
        Evento evento = (Evento) serv;
        System.out.println("1 - Nome");
        System.out.println("2 - Data");
        System.out.println("3 - Local");
        System.out.println("4 - Lotação Máxima");
        System.out.println("5 - Ingressos Vendidos");
        System.out.println("6 - Preço do ingresso");
        System.out.println("7 - Sair");

        int opcao = scanner.nextInt();
        scanner.nextLine();
        switch (opcao) {
          case 1:
            System.out.println("Digite o novo nome:");
            evento.setNome(scanner.nextLine());
            break;
          case 2:
            System.out.println("Digite a nova data:");
            evento.setData(scanner.nextLine());
            break;
          case 3:
            System.out.println("Digite o novo local:");
            evento.setLocal(scanner.nextLine());
            break;
          case 4:
            System.out.println("Digite a nova lotação máxima:");
            evento.setLotacaoMaxima(scanner.nextInt());
            scanner.nextLine();
            break;
          case 5:
            System.out.println("Digite a nova quantidade de ingressos vendidos:");
            evento.setQtdeIngressosVendidos(scanner.nextInt());
            scanner.nextLine();
            break;
          case 6:
            System.out.println("Digite o novo preço do ingresso:");
            evento.setPrecoIngresso(scanner.nextDouble());
            scanner.nextLine();
            break;
          case 7:
            b = false;
            break;
          default:
            System.out.println("Opção inválida!");
            break;
        }
      }
    }
    return servi + " alterado.";
  }

  public void listarServicos(String tipoServico) {
    Servico[] vetor = e_control.getServicos();
    for (Servico servico : vetor) {
      if (tipoServico.equals("evento") && servico instanceof Evento) {
        System.out.println(servico.toString());
      } else if (tipoServico.equals("reserva") && servico instanceof Reserva) {
        System.out.println(servico.toString());
      }
    }
  }

  public String excluirEvento(String servico) {
    System.out.println("Digite o nome do " + servico + " a ser excluído:");
    String nome = scanner.nextLine();
    if (this.e_control.verificarEvento(nome)) {
      e_control.excluirEvento(nome);
      return servico + " excluído!";
    }
    return "Não encontrado.";
  }
}