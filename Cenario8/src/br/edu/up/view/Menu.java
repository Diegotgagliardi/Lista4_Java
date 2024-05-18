package br.edu.up.view;

import java.util.Scanner;

import br.edu.up.controller.Controller;

public class Menu {
    private Scanner scanner;
    private Controller controller;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.controller = new Controller();
    }

    public void exibirMenu() {
        System.out.println("\n===== Agenda de Contatos =====");
        System.out.println("1. Incluir um contato pessoal");
        System.out.println("2. Incluir um contato comercial");
        System.out.println("3. Excluir um contato pelo código");
        System.out.println("4. Consultar um contato pelo código");
        System.out.println("5. Listar todos os contatos");
        System.out.println("6. Sair do programa");
        System.out.print("Digite a opção desejada: ");

        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        switch (opcao) {
            case 1:
                adicionarContatoPessoal();
                break;
            case 2:
                adicionarContatoComercial();
                break;
            case 3:
                excluirContato();
                break;
            case 4:
                consultarContato();
                break;
            case 5:
                listarContatos();
                break;
            case 6:
                System.out.println("Saindo do programa...");
                System.exit(0);
            default:
                System.out.println("Opção inválida!");
        }

        exibirMenu();
    }

    private void adicionarContatoPessoal() {
        System.out.println("\n===== Incluir Contato Pessoal =====");
        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Aniversário: ");
        String aniversario = scanner.nextLine();

        controller.adicionarContatoPessoal(codigo, nome, telefone, aniversario);
    }

    private void adicionarContatoComercial() {
        System.out.println("\n===== Incluir Contato Comercial =====");
        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("CNPJ: ");
        String cnpj = scanner.nextLine();

        controller.adicionarContatoComercial(codigo, nome, telefone, cnpj);
    }

    private void excluirContato() {
        System.out.println("\n===== Excluir Contato =====");
        System.out.print("Digite o código do contato a ser excluído: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        controller.excluirContato(codigo);
    }

    private void consultarContato() {
        System.out.println("\n===== Consultar Contato =====");
        System.out.print("Digite o código do contato a ser consultado: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        controller.consultarContato(codigo);
    }

    private void listarContatos() {
        System.out.println("\n===== Listar Contatos =====");
        controller.listarContatos();
    }
}