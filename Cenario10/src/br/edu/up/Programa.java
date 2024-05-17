package br.edu.up;

import br.edu.up.controller.Controlador;
import br.edu.up.view.Menu;

public class Programa {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Controlador controlador = new Controlador(menu);

        controlador.iniciar();
    }
}