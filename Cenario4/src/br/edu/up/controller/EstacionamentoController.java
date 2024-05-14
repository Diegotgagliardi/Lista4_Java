package br.edu.up.controller;

import java.util.ArrayList;
import java.util.List;
import br.edu.up.model.Estacionamento;
import br.edu.up.model.Veiculo;

public class EstacionamentoController {
    private Estacionamento estacionamento;
    private List<Veiculo> veiculosEstacionados;

    public EstacionamentoController() {
        this.estacionamento = new Estacionamento(10);
        this.veiculosEstacionados = new ArrayList<>();
    }

    public String entradaVeiculo(String modelo, String placa, String cor) {
        if (estacionamento.getVagas() > 0) {
            Veiculo veiculo = new Veiculo(modelo, placa, cor);
            veiculosEstacionados.add(veiculo);
            estacionamento.setVagas(estacionamento.getVagas() - 1);
            return "Veículo estacionado com sucesso!";
        } else {
            return "Estacionamento cheio!";
        }
    }

    public String saidaVeiculo(String placa) {
        for (int i = 0; i < veiculosEstacionados.size(); i++) {
            if (veiculosEstacionados.get(i).getPlaca().equals(placa)) {
                veiculosEstacionados.remove(i);
                estacionamento.setVagas(estacionamento.getVagas() + 1);
                estacionamento.setCaixa(estacionamento.getCaixa() + estacionamento.getValorPeriodo());
                return "Veículo de placa " + placa + " retirado com sucesso!";
            }
        }
        return "Veículo de placa " + placa + " não encontrado!";
    }

    public String gerarRelatorio() {
        return "RELATÓRIO:\n" +
               "Veículos estacionados: " + (10 - estacionamento.getVagas()) + "\n" +
               "Total arrecadado: R$" + estacionamento.getCaixa();
    }
}
