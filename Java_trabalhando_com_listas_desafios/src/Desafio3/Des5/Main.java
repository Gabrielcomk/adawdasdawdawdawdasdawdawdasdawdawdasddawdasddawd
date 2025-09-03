package Desafio3.Des5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Desafio3Forma> listaDesafio3Formas = new ArrayList<>();

        Desafio3Quadrado desafio3Quadrado = new Desafio3Quadrado();
        desafio3Quadrado.lado = 4;
        desafio3Quadrado.nome = "Quadrado";

        Desafio3Circulo desafio3Circulo = new Desafio3Circulo();
        desafio3Circulo.raio = 5;
        desafio3Circulo.nome = "Círculo";

        listaDesafio3Formas.add(desafio3Circulo);
        listaDesafio3Formas.add(desafio3Quadrado);

        for (Desafio3Forma desafio3Forma : listaDesafio3Formas) {
            System.out.println("Área de: " + desafio3Forma.calcularArea());
        }
    }
}