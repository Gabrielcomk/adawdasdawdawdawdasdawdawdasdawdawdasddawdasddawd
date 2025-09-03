package Desafio3.Des1;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> kitPc = new ArrayList<>();
        kitPc.add("Mouse");
        kitPc.add("Keyboard");
        kitPc.add("CPU");
        kitPc.add("Monitor");
        kitPc.forEach(System.out::println);
    }
}
