package br.edu.up.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import br.edu.up.model.Seguro;
import br.edu.up.model.SeguroVeiculo;
import br.edu.up.model.SeguroVida;
import br.edu.up.view.Menu;

public class Controlador {
    private List<Seguro> seguros = new ArrayList<>();
    private Menu menu;

    public Controlador(Menu menu) {
        this.menu = menu;
    }

    public void iniciar() {
        while (true) {
            menu.exibirMenu();
            int opcao = menu.obterOpcao();

            switch (opcao) {
                case 1:
                    incluirSeguro();
                    break;
                case 2:
                    localizarSeguro();
                    break;
                case 3:
                    excluirSeguro();
                    break;
                case 4:
                    excluirTodosSeguros();
                    break;
                case 5:
                    listarTodosSeguros();
                    break;
                case 6:
                    verQuantidadeDeSeguros();
                    break;
                case 7:
                    System.out.println("Saindo do programa...");
                    menu.fecharScanner();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void incluirSeguro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tipo de seguro (1-Veículo, 2-Vida): ");
        int tipoSeguro = scanner.nextInt();
        scanner.nextLine(); 

        Seguro seguro = null;

        if (tipoSeguro == 1) {
            seguro = new SeguroVeiculo();
        } else if (tipoSeguro == 2) {
            seguro = new SeguroVida();
        } else {
            System.out.println("Tipo de seguro inválido!");
            return;
        }

        System.out.print("Digite a apólice: ");
        seguro.setApolice(scanner.nextLine());

        System.out.print("Digite o nome do segurado: ");
        seguro.setSegurado(scanner.nextLine());

        System.out.print("Digite o valor da apólice: ");
        seguro.setVrApolice(scanner.nextDouble());
        scanner.nextLine(); 

        System.out.print("Digite a data de início (AAAA-MM-DD): ");
        seguro.setDtInicio(LocalDate.parse(scanner.nextLine()));

        System.out.print("Digite a data de fim (AAAA-MM-DD): ");
        seguro.setDtFim(LocalDate.parse(scanner.nextLine()));

        if (seguro instanceof SeguroVeiculo) {
            SeguroVeiculo seguroVeiculo = (SeguroVeiculo) seguro;
            System.out.print("Digite o valor da franquia: ");
            seguroVeiculo.setVrFranquia(scanner.nextDouble());
            scanner.nextLine(); 

            System.out.print("Tem carro reserva (S/N)? ");
            seguroVeiculo.setTemCarroReserva(scanner.nextLine().equalsIgnoreCase("S"));

            System.out.print("Cobre vidros (S/N)? ");
            seguroVeiculo.setCobreVidros(scanner.nextLine().equalsIgnoreCase("S"));
        } else if (seguro instanceof SeguroVida) {
            SeguroVida seguroVida = (SeguroVida) seguro;
            System.out.print("Cobre doença (S/N)? ");
            seguroVida.setCobreDoenca(scanner.nextLine().equalsIgnoreCase("S"));

            System.out.print("Cobre acidente (S/N)? ");
            seguroVida.setCobreAcidente(scanner.nextLine().equalsIgnoreCase("S"));
        }

        seguros.add(seguro);
        System.out.println("Seguro adicionado com sucesso!");
        scanner.close();
    }

    private void localizarSeguro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a apólice do seguro: ");
        String apolice = scanner.nextLine();
        scanner.close();

        for (Seguro seguro : seguros) {
            if (seguro.getApolice().equalsIgnoreCase(apolice)) {
                System.out.println(seguro.getDados());
                return;
            }
        }

        System.out.println("Seguro não encontrado!");
    }

    private void excluirSeguro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a apólice do seguro a ser excluído: ");
        String apolice = scanner.nextLine();
        scanner.close();

        boolean seguroExcluido = seguros.removeIf(seguro -> seguro.getApolice().equalsIgnoreCase(apolice));

        if (seguroExcluido) {
            System.out.println("Seguro excluído com sucesso!");
        } else {
            System.out.println("Seguro não encontrado!");
        }
    }

    private void excluirTodosSeguros() {
        seguros.clear();
        System.out.println("Todos os seguros foram excluídos!");
    }

    private void listarTodosSeguros() {
        if (seguros.isEmpty()) {
            System.out.println("Não há seguros cadastrados.");
        } else {
            for (Seguro seguro : seguros) {
                System.out.println(seguro.getDados());
            }
        }
    }

    private void verQuantidadeDeSeguros() {
        System.out.println("Quantidade de seguros: " + seguros.size());
    }
}