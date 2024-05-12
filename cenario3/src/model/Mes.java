package model;

public class Mes {
    String nome;
    int qtdeDias;
    Dia[] dias;

    public Mes(String nome, int qtdeDias) {
        this.nome = nome;
        this.qtdeDias = qtdeDias;
        dias = new Dia[qtdeDias];
        for (int i = 0; i < qtdeDias; i++) {
            dias[i] = new Dia(i + 1);
        }
    }

    public void adicionarCompromisso(int dia, Compromisso compromisso) {
        dias[dia - 1].adicionarCompromisso(compromisso);
    }
}
