package br.edu.up.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.up.model.Aeronave;
import br.edu.up.model.Comandante;
import br.edu.up.model.Comissario;
import br.edu.up.model.Passageiro;
import br.edu.up.model.Pessoa;
import br.edu.up.model.Tripulacao;

public class AeroportoController {
    private List<Aeronave> aeronaves;
    private List<Passageiro> passageiros;
    private List<Comandante> comandantes;
    private List<Comissario> comissarios;
    private List<Tripulacao> tripulacoes;
    private Scanner scanner;

    public AeroportoController(){
        this.aeronaves = new ArrayList<>();
        this.passageiros = new ArrayList<>();
        this.comandantes = new ArrayList<>();
        this.comissarios = new ArrayList<>();
        this.tripulacoes = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void cadastrarAeronave() {
        System.out.println("===== Cadastro de Aeronave =====");
        System.out.print("Digite o código da aeronave: ");
        String codigo = scanner.nextLine();
        System.out.print("Digite o tipo da aeronave: ");
        String tipo = scanner.nextLine();
        System.out.print("Digite a quantidade de assentos: ");
        int qtdAssentos = scanner.nextInt();
        scanner.nextLine();
        Aeronave aeronave = new Aeronave();
        aeronave.setCodigo(codigo);
        aeronave.setTipo(tipo);
        aeronave.setQtdAssentos(qtdAssentos);
        aeronaves.add(aeronave);
        System.out.println("Aeronave cadastrada com sucesso!");
    }

    public void cadastrarPassageiro() {
        System.out.println("===== Cadastro de Passageiro =====");
        System.out.print("Digite o nome do passageiro: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o RG do passageiro: ");
        String RG = scanner.nextLine();
        System.out.print("Digite o ID da bagagem: ");
        String idBagagem = scanner.nextLine();
        System.out.print("Digite o número da passagem: ");
        String passagem = scanner.nextLine();
        Passageiro passageiro = new Passageiro();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setRG(RG);
        passageiro.setIdBagagem(idBagagem);
        passageiro.setPassagem(passagem);
        passageiros.add(passageiro);
        System.out.println("Passageiro cadastrado com sucesso!");
    }

    public void cadastrarComandante() {
        System.out.println("===== Cadastro de Comandante =====");
        System.out.print("Digite o nome do comandante: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o RG do comandante: ");
        String RG = scanner.nextLine();
        System.out.print("Digite o total de horas de voo: ");
        int totalHorasVoo = scanner.nextInt();
        scanner.nextLine();
        Comandante comandante = new Comandante();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setRG(RG);
        comandante.setTotalHorasVoo(totalHorasVoo);
        comandantes.add(comandante);
        System.out.println("Comandante cadastrado com sucesso!");
    }

    public void cadastrarComissario() {
        System.out.println("===== Cadastro de Comissário =====");
        System.out.print("Digite o nome do comissário: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o RG do comissário: ");
        String RG = scanner.nextLine();
        Comissario comissario = new Comissario();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setRG(RG);
        comissarios.add(comissario);
        System.out.println("Comissário cadastrado com sucesso!");
    }

    public void cadastrarTripulacao() {
        System.out.println("===== Cadastro de Tripulação =====");
        System.out.print("Digite a identificação aeronáutica: ");
        String identificacaoAeronautica = scanner.nextLine();
        System.out.print("Digite a matrícula do funcionário: ");
        String matriculaFuncionario = scanner.nextLine();
        Tripulacao tripulacao = new Tripulacao();
        tripulacao.setIdentificacaoAeronautica(identificacaoAeronautica);
        tripulacao.setMatriculaFuncionario(matriculaFuncionario);
        tripulacoes.add(tripulacao);
        System.out.println("Tripulação cadastrada com sucesso!");
    }
}