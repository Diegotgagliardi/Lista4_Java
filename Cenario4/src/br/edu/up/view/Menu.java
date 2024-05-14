package br.edu.up.view;

import java.util.Scanner;
import br.edu.up.controller.EstacionamentoController;

public class Menu {
    private Scanner scanner;
    private EstacionamentoController estacionamentoController;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.estacionamentoController = new EstacionamentoController();
    }

    public void exibirMenu() {
        System.out.println("\n===== Sistema de Estacionamento =====");
        System.out.println("1 - Entrada de Veículo");
        System.out.println("2 - Saída de Veículo");
        System.out.println("3 - Relatório");
        System.out.println("4 - Encerrar");
        System.out.print("Escolha uma opção: ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                entradaVeiculo();
                break;
            case 2:
                saidaVeiculo();
                break;
            case 3:
                exibirRelatorio();
                break;
            case 4:
                System.out.println("Encerrando o sistema...");
                System.exit(0);
            default:
                System.out.println("Opção inválida!");
        }

        exibirMenu();
    }

    private void entradaVeiculo() {
        System.out.println("\n===== Entrada de Veículo =====");
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Placa: ");
        String placa = scanner.nextLine();
        System.out.print("Cor: ");
        String cor = scanner.nextLine();

        String mensagem = estacionamentoController.entradaVeiculo(modelo, placa, cor);
        System.out.println(mensagem);
    }

    private void saidaVeiculo() {
        System.out.println("\n===== Saída de Veículo =====");
        System.out.print("Placa do veículo: ");
        String placa = scanner.nextLine();

        String mensagem = estacionamentoController.saidaVeiculo(placa);
        System.out.println(mensagem);
    }

    private void exibirRelatorio() {
        String relatorio = estacionamentoController.gerarRelatorio();
        System.out.println("\n" + relatorio);
    }
}