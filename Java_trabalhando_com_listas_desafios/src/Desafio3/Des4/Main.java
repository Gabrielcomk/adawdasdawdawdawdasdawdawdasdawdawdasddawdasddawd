package Desafio3.Des4;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Desafio3Produto> listaDesafio3Produtos = new ArrayList<>();
        Desafio3Produto item1 = new Desafio3Produto("Pé de galinha", 3.90);
        Desafio3Produto item2 = new Desafio3Produto("Pé de coelho", 9.90);
        Desafio3Produto item3 = new Desafio3Produto("Pé de lobo", 14.90);
        listaDesafio3Produtos.add(item1);
        listaDesafio3Produtos.add(item2);
        listaDesafio3Produtos.add(item3);
        listaDesafio3Produtos.forEach(System.out::println);
    }
}
