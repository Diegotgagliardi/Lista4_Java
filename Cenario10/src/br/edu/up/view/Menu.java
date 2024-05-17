package br.edu.up.view;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Incluir seguro");
        System.out.println("2. Localizar seguro");
        System.out.println("3. Excluir seguro");
        System.out.println("4. Excluir todos os seguros");
        System.out.println("5. Listar todos os seguros");
        System.out.println("6. Ver quantidade de seguros");
        System.out.println("7. Sair");
        System.out.print("Digite a opção desejada: ");
    }

    public int obterOpcao() {
        return scanner.nextInt();
    }

    public String obterString() {
        scanner.nextLine();
        return scanner.nextLine();
    }

    public void fecharScanner() {
        scanner.close();
    }
}
