package br.edu.up.view;

import br.edu.up.model.Ponto;

public class Programa2 {
  public static void main(String[] args) throws Exception {
    Ponto ponto1 = new Ponto();

    Ponto ponto2 = new Ponto(2, 5);

    double distancia = calcularDistancia(ponto1, ponto2);
    System.out.println("A distância entre ponto1 e ponto2 é: " + distancia);

    Ponto ponto3 = new Ponto(7, 2);
    distancia = calcularDistancia(ponto2, ponto3);
    System.out.println("A distância entre ponto2 e ponto3 é: " + distancia);

    ponto1.setX(10);

    ponto1.setY(3);
  }

  public static double calcularDistancia(Ponto ponto1, Ponto ponto2) {
    double deltaX = ponto2.getX() - ponto1.getX();
    double deltaY = ponto2.getY() - ponto1.getY();
    return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
  }
}