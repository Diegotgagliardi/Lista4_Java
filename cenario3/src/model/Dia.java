package model; // Define o pacote do arquivo.

public class Dia { // Declara a classe pública Dia.
    int diaMes; // Variável para armazenar o dia do mês.
    Compromisso[] compromissos = new Compromisso[24]; // Array para armazenar os compromissos do dia (um para cada hora).

    public Dia(int diaMes) { // Construtor da classe Dia.
        this.diaMes = diaMes; // Atribui o valor do parâmetro diaMes à variável de instância diaMes.
    }

    public void adicionarCompromisso(Compromisso compromisso) { // Método para adicionar um compromisso ao dia.
        compromissos[compromisso.getHora()] = compromisso; // Adiciona o compromisso ao array compromissos, utilizando a hora do compromisso como índice.
    }
}