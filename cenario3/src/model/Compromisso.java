package model; // Define o pacote do arquivo.

public class Compromisso { // Declara a classe pública Compromisso.
    private String pessoa; // Variável privada para armazenar o nome da pessoa envolvida no compromisso.
    private String local; // Variável privada para armazenar o local do compromisso.
    private String assunto; // Variável privada para armazenar o assunto do compromisso.
    private int hora; // Variável privada para armazenar a hora do compromisso.

    public Compromisso(String pessoa, String local, String assunto, int hora){ // Construtor da classe Compromisso.
        this.pessoa = pessoa; // Atribui o valor do parâmetro pessoa à variável de instância pessoa.
        this.local = local; // Atribui o valor do parâmetro local à variável de instância local.
        this.assunto = assunto; // Atribui o valor do parâmetro assunto à variável de instância assunto.
        this.hora = hora; // Atribui o valor do parâmetro hora à variável de instância hora.
    }

    public String getPessoa() { // Método getter para retornar o valor da variável pessoa.
        return pessoa; 
    }

    public void setPessoa(String pessoa) { // Método setter para atribuir um novo valor à variável pessoa.
        this.pessoa = pessoa; 
    }

    public String getLocal() { // Método getter para retornar o valor da variável local.
        return local; 
    }   

    public void setLocal(String local) { // Método setter para atribuir um novo valor à variável local.
        this.local = local; 
    }

    public String getAssunto() { // Método getter para retornar o valor da variável assunto.
        return assunto; 
    }

    public void setAssunto(String assunto) { // Método setter para atribuir um novo valor à variável assunto.
        this.assunto = assunto; 
    }

    public int getHora() { // Método getter para retornar o valor da variável hora.
        return hora; 
    }

    public void setHora(int hora) { // Método setter para atribuir um novo valor à variável hora.
        this.hora = hora; 
    }
}