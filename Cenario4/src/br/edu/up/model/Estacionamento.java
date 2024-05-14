package br.edu.up.model;

public class Estacionamento {
    private int vagas;
    private double valorPeriodo = 5.0;
    private double caixa;

    public void entrada(String Veiculo, int vagas){
        if(vagas > 0 ){

        }else{
            return "Estaciomamento cheio"
        }
    }

    public void saida(){
        vagas = -1;
    }

    public void totalVagas(){
        return vagas;
    }

    public void relatorio(){
        return 
    }
}


