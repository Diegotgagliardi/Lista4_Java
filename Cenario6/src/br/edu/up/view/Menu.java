package br.edu.up.view;
import java.util.Scanner;
import br.edu.up.controller.AeroportoController;

public class Menu {
    private Scanner scanner;
    private AeroportoController aeroportoController;

    public Menu(){
        this.scanner = new Scanner(System.in);
        this.aeroportoController = new AeroportoController();
    }

    public void exibirMenu() {
        
    }
}
