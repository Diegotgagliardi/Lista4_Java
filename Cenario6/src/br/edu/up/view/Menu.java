package br.edu.up.view;

import java.util.Scanner;
import br.edu.up.controller.AeroportoController;

public class Menu {
    private Scanner scanner;
    private AeroportoController aeroportoController;

    public Menu(){
        this.scanner = new Scanner(System.in);
        this.aeroportoController = new AeroportoController();
    }

    public void exibirMenu() {
        int opcao = 0;
        do {
            System.out.println("===== MENU =====");
            System.out.println("1 - Cadastrar Aeronave");
            System.out.println("2 - Cadastrar Passageiro");
            System.out.println("3 - Cadastrar Comandante");
            System.out.println("4 - Cadastrar Comissário");
            System.out.println("5 - Cadastrar Tripulação");
            System.out.println("6 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    aeroportoController.cadastrarAeronave();
                    break;
                case 2:
                    aeroportoController.cadastrarPassageiro();
                    break;
                case 3:
                    aeroportoController.cadastrarComandante();
                    break;
                case 4:
                    aeroportoController.cadastrarComissario();
                    break;
                case 5:
                    aeroportoController.cadastrarTripulacao();
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 6);
    }
}