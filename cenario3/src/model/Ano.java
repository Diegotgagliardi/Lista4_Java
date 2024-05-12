package model;

public class Ano {
    int ano;
    boolean bissexto;
    Mes[] meses = new Mes[12];

    public Ano(int ano, boolean bissexto) {
        this.ano = ano;
        this.bissexto = bissexto;
        meses[0] = new Mes("Janeiro", 31);
        meses[1] = new Mes("Fevereiro", bissexto ? 29 : 28);
        meses[2] = new Mes("Março", 31);
        meses[3] = new Mes("Abril", 30);
        meses[4] = new Mes("Maio", 31);
        meses[5] = new Mes("Junho", 30);
        meses[6] = new Mes("Julho", 31);
        meses[7] = new Mes("Agosto", 31);
        meses[8] = new Mes("Setembro", 30);
        meses[9] = new Mes("Outubro", 31);
        meses[10] = new Mes("Novembro", 30);
        meses[11] = new Mes("Dezembro", 31);
    }

    public void adicionarCompromisso(int mes, int dia, Compromisso compromisso) {
        meses[mes - 1].adicionarCompromisso(dia, compromisso);
    }

    public void mostrarCompromissos() {
        for (int i = 0; i < 12; i++) {
            System.out.println("Mês " + meses[i].nome + ":");
            for (int j = 0; j < meses[i].qtdeDias; j++) {
                for (int k = 0; k < meses[i].dias[j].compromissos.length; k++) {
                    Compromisso compromisso = meses[i].dias[j].compromissos[k];
                    if (compromisso != null) {
                        System.out.println("  Dia " + (j + 1) + " - " + compromisso.getHora() + "h: " + compromisso.getAssunto() + " com " + compromisso.getPessoa() + " em " + compromisso.getLocal()); 
                    }
                }
            }
        }
    }
}