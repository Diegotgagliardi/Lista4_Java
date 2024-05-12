package br.edu.up;

import model.Ano;
import model.Compromisso;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ano ano = new Ano(2023, false);

        ano.adicionarCompromisso(1, 5, new Compromisso("Alan", "Escritório", "Reunião", 10));
        ano.adicionarCompromisso(2, 14, new Compromisso("Débora", "Restaurante", "Almoço", 12));
        ano.adicionarCompromisso(2, 14, new Compromisso("Pedro", "Cinema", "Filme", 20));

        while (true) {
            ano.mostrarCompromissos();

            System.out.print("\nDeseja adicionar um novo compromisso? (s/n): ");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("n")) {
                break;
            }

            System.out.print("Mês (1-12): ");
            int mes = scanner.nextInt();
            System.out.print("Dia (1-31): ");
            int dia = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Pessoa: ");
            String pessoa = scanner.nextLine();
            System.out.print("Local: ");
            String local = scanner.nextLine();
            System.out.print("Assunto: ");
            String assunto = scanner.nextLine();
            System.out.print("Hora (0-23): ");
            int hora = scanner.nextInt();
            scanner.nextLine(); 

            ano.adicionarCompromisso(mes, dia, new Compromisso(pessoa, local, assunto, hora));
        }

        System.out.println("\nPrograma encerrado.");
        scanner.close();
    }
}