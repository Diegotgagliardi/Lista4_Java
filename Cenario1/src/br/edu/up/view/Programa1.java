package br.edu.up.view;

import br.edu.up.model.Livro;

public class Programa1 {
    public static void main(String[] args) throws Exception {

        Livro livro1 = new Livro("1234", "Senhor dos Aneis", new String[] { "J.R.R. Tolkien" }, "1568941201", 1954);
        Livro livro2 = new Livro("5678", "O código da vinci", new String[] { "Dan Brown" }, "6+526651GHF", 1980);

        System.out.println(livro1);
        System.out.println(livro2);
    }
}