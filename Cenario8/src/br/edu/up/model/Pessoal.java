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
        return "Pessoal(exemplo){nome='" + nome + "', idade=" + idade + "}";
    }

}
