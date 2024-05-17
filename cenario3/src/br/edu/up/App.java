package br.edu.up; // Define o pacote do arquivo.

import model.Ano; // Importa a classe Ano do pacote model.
import model.Compromisso; // Importa a classe Compromisso do pacote model.
import java.util.Scanner; // Importa a classe Scanner para receber entrada do usuário.

public class App { // Declara a classe pública App.
    public static void main(String[] args) { // Define o método principal da aplicação.
        Scanner scanner = new Scanner(System.in); // Cria um novo objeto Scanner para ler a entrada do usuário.
        Ano ano = new Ano(2024, false); // Cria um novo objeto Ano para o ano 2024, que não é bissexto.
        ano.adicionarCompromisso(1, 5, new Compromisso("Alan", "Escritório", "Reunião", 10)); // Adiciona um compromisso no dia 5 de janeiro.
        ano.adicionarCompromisso(2, 14, new Compromisso("Débora", "Restaurante", "Almoço", 12)); // Adiciona um compromisso no dia 14 de fevereiro.
        ano.adicionarCompromisso(2, 14, new Compromisso("Pedro", "Cinema", "Filme", 20)); // Adiciona outro compromisso no dia 14 de fevereiro.
        while (true) { // Inicia um loop infinito que permite ao usuário adicionar compromissos.
            ano.mostrarCompromissos(); // Exibe os compromissos já cadastrados.
            System.out.print("\nDeseja adicionar um novo compromisso? (s/n): "); // Pergunta ao usuário se ele deseja adicionar um novo compromisso.
            String resposta = scanner.nextLine(); // Lê a resposta do usuário.
            if (resposta.equalsIgnoreCase("n")) { // Se a resposta for "n" (case insensitive), sai do loop.
                break; 
            }
            System.out.print("Mês (1-12): "); // Solicita o mês do compromisso.
            int mes = scanner.nextInt(); // Lê o mês digitado pelo usuário.
            System.out.print("Dia (1-31): "); // Solicita o dia do compromisso.
            int dia = scanner.nextInt(); // Lê o dia digitado pelo usuário.
            scanner.nextLine(); // Limpa o buffer do scanner (remove a quebra de linha).
            System.out.print("Pessoa: "); // Solicita o nome da pessoa envolvida no compromisso.
            String pessoa = scanner.nextLine(); // Lê o nome da pessoa digitado pelo usuário.
            System.out.print("Local: "); // Solicita o local do compromisso.
            String local = scanner.nextLine(); // Lê o local digitado pelo usuário.
            System.out.print("Assunto: "); // Solicita o assunto do compromisso.
            String assunto = scanner.nextLine(); // Lê o assunto digitado pelo usuário.
            System.out.print("Hora (0-23): "); // Solicita a hora do compromisso.
            int hora = scanner.nextInt(); // Lê a hora digitada pelo usuário.
            scanner.nextLine(); // Limpa o buffer do scanner (remove a quebra de linha).
            ano.adicionarCompromisso(mes, dia, new Compromisso(pessoa, local, assunto, hora)); // Adiciona o novo compromisso ao objeto Ano.
        }
        System.out.println("\nPrograma encerrado."); // Informa que o programa foi encerrado.
        scanner.close(); // Fecha o objeto Scanner.
    }
}