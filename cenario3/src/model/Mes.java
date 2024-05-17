package model; // Define o pacote do arquivo.

public class Mes { // Declara a classe pública Mes.
    String nome; // Variável para armazenar o nome do mês.
    int qtdeDias; // Variável para armazenar a quantidade de dias do mês.
    Dia[] dias; // Array para armazenar os dias do mês.

    public Mes(String nome, int qtdeDias) { // Construtor da classe Mes.
        this.nome = nome; // Atribui o valor do parâmetro nome à variável de instância nome.
        this.qtdeDias = qtdeDias; // Atribui o valor do parâmetro qtdeDias à variável de instância qtdeDias.
        dias = new Dia[qtdeDias]; // Cria um novo array de Dia com o tamanho da quantidade de dias do mês.
        for (int i = 0; i < qtdeDias; i++) { // Itera sobre cada dia do mês.
            dias[i] = new Dia(i + 1); // Cria um novo objeto Dia para cada dia do mês, definindo o dia do mês (i + 1).
        }
    }

    public void adicionarCompromisso(int dia, Compromisso compromisso) { // Método para adicionar um compromisso a um determinado dia do mês.
        dias[dia - 1].adicionarCompromisso(compromisso); // Chama o método adicionarCompromisso do objeto Dia correspondente ao dia passado como parâmetro, passando o compromisso.
    }
}