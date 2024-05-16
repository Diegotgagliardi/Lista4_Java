package br.edu.up.model;

public class Pessoal {
    private String aniversario;

    public void Pessoal(int codigo, String telefone, String aniversario){

    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    @Override
    public String toString() {
        return "Pessoa(exemplo){nome='" + nome + "', idade=" + idade + "}";
    }

}
