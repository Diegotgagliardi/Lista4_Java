package model;

public class Dia {
    int diaMes;
    Compromisso[] compromissos = new Compromisso[24];

    public Dia(int diaMes) {
        this.diaMes = diaMes;
    }

    public void adicionarCompromisso(Compromisso compromisso) {
        compromissos[compromisso.getHora()] = compromisso;
    }
}