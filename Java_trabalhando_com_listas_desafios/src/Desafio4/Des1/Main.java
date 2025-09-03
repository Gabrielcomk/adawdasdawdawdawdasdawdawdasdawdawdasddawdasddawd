package Desafio4.Des1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(1);
        numeros.add(2);
        System.out.println("\nLista: " + numeros);
        Collections.sort(numeros);
        System.out.println("\nLista: " + numeros);
    }
}
