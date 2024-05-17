package model; // Define o pacote do arquivo.

public class Ano { // Declara a classe pública Ano.
    int ano; // Variável para armazenar o ano.
    boolean bissexto; // Variável booleana para indicar se o ano é bissexto.
    Mes[] meses = new Mes[12]; // Array para armazenar os 12 meses do ano.

    public Ano(int ano, boolean bissexto) { // Construtor da classe Ano.
        this.ano = ano; // Atribui o valor do parâmetro ano à variável de instância ano.
        this.bissexto = bissexto; // Atribui o valor do parâmetro bissexto à variável de instância bissexto.
        meses[0] = new Mes("Janeiro", 31); // Cria um novo objeto Mes para Janeiro, com 31 dias.
        meses[1] = new Mes("Fevereiro", bissexto ? 29 : 28); // Cria um novo objeto Mes para Fevereiro, com 29 dias se for bissexto, caso contrário, 28 dias.
        meses[2] = new Mes("Março", 31); // Cria um novo objeto Mes para Março, com 31 dias.
        meses[3] = new Mes("Abril", 30); // Cria um novo objeto Mes para Abril, com 30 dias.
        meses[4] = new Mes("Maio", 31); // Cria um novo objeto Mes para Maio, com 31 dias.
        meses[5] = new Mes("Junho", 30); // Cria um novo objeto Mes para Junho, com 30 dias.
        meses[6] = new Mes("Julho", 31); // Cria um novo objeto Mes para Julho, com 31 dias.
        meses[7] = new Mes("Agosto", 31); // Cria um novo objeto Mes para Agosto, com 31 dias.
        meses[8] = new Mes("Setembro", 30); // Cria um novo objeto Mes para Setembro, com 30 dias.
        meses[9] = new Mes("Outubro", 31); // Cria um novo objeto Mes para Outubro, com 31 dias.
        meses[10] = new Mes("Novembro", 30); // Cria um novo objeto Mes para Novembro, com 30 dias.
        meses[11] = new Mes("Dezembro", 31); // Cria um novo objeto Mes para Dezembro, com 31 dias.
    }

    public void adicionarCompromisso(int mes, int dia, Compromisso compromisso) { // Método para adicionar um compromisso a um determinado mês e dia.
        meses[mes - 1].adicionarCompromisso(dia, compromisso); // Chama o método adicionarCompromisso do objeto Mes correspondente ao mês passado como parâmetro, passando o dia e o compromisso.
    }

    public void mostrarCompromissos() { // Método para exibir os compromissos cadastrados.
        for (int i = 0; i < 12; i++) { // Itera sobre cada mês do ano.
            System.out.println("Mês " + meses[i].nome + ":"); // Imprime o nome do mês.
            for (int j = 0; j < meses[i].qtdeDias; j++) { // Itera sobre cada dia do mês.
                for (int k = 0; k < meses[i].dias[j].compromissos.length; k++) { // Itera sobre os compromissos de cada dia.
                    Compromisso compromisso = meses[i].dias[j].compromissos[k]; // Recupera o compromisso atual.
                    if (compromisso != null) { // Verifica se o compromisso existe (não é null).
                        System.out.println("  Dia " + (j + 1) + " - " + compromisso.getHora() + "h: " + compromisso.getAssunto() + " com " + compromisso.getPessoa() + " em " + compromisso.getLocal()); // Imprime os detalhes do compromisso, incluindo dia, hora, assunto, pessoa e local.
                    }
                 }
            }
        }
    }
}