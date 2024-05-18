package br.edu.up.controller;

import java.util.Scanner;

import br.edu.up.model.Agenda;
import br.edu.up.model.Comercial;
import br.edu.up.model.Contato;
import br.edu.up.model.Pessoal;

public class Controller {
    private Agenda agenda;

    public Controller() {
        agenda = new Agenda();
    }

    public void adicionarContatoPessoal(Scanner scanner) {
        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Aniversário: ");
        String aniversario = scanner.nextLine();

        Pessoal pessoal = new Pessoal(codigo, nome, telefone, aniversario);
        agenda.adicionar(pessoal);
        System.out.println("Contato pessoal adicionado com sucesso!");
    }

    public void adicionarContatoComercial(Scanner scanner) {
        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("CNPJ: ");
        String cnpj = scanner.nextLine();

        Comercial comercial = new Comercial(codigo, nome, telefone, cnpj);
        agenda.adicionar(comercial);
        System.out.println("Contato comercial adicionado com sucesso!");
    }

    public void excluirContato(Scanner scanner) {
        System.out.print("Digite o código do contato a ser excluído: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        agenda.excluirContato(codigo);
        System.out.println("Contato excluído com sucesso!");
    }

    public void consultarContato(Scanner scanner) {
        System.out.print("Digite o código do contato a ser consultado: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        Contato contato = agenda.getContato(codigo);
        if (contato != null) {
            System.out.println(contato);
        } else {
            System.out.println("Contato não encontrado!");
        }
    }

    public void listarContatos() {
        List<Contato> contatos = agenda.getContatos();
        if (contatos.isEmpty()) {
            System.out.println("A agenda está vazia!");
        } else {
            for (Contato contato : contatos) {
                System.out.println(contato);
            }
        }
    }
}