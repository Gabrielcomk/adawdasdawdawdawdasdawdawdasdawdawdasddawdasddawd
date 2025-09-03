package Desafio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Desafio2Produto> listaDesafio2Produtos = new ArrayList<>();

        var item1 = new Desafio2Produto(1, "Linguiça", 9.50, 3);
        var item2 = new Desafio2ProdutoPerecivel(2, "Tomate", 3.50, 20, LocalDate.of(2026, 6, 1));

        listaDesafio2Produtos.add(item1);
        listaDesafio2Produtos.add(item2);


        System.out.println("O que fazer?\n" +
                "1-mostrar tudo.\n" +
                "2-mostrar por código.");
        int opcao = scan.nextInt();
        int codigo;
        switch(opcao) {
            case 1 -> listaDesafio2Produtos.forEach(System.out::println);
            case 2 -> {
                System.out.println("Digite o código do produto: ");
                codigo = scan.nextInt();
                Desafio2Produto desafio2ProdutoEncontrado = listaDesafio2Produtos.stream()
                        .filter(p -> p.getCodigo() == codigo)
                        .findFirst()
                        .orElse(null);
                if (desafio2ProdutoEncontrado != null) {
                    System.out.println("Produto encontrado.\n" + desafio2ProdutoEncontrado);
                } else if (desafio2ProdutoEncontrado == null) {
                    System.out.println("Não existe um produto com esse código na lista.");
                }
            }
            default -> System.out.println("Opção inválida");
        }
        scan.close();
    }
    }