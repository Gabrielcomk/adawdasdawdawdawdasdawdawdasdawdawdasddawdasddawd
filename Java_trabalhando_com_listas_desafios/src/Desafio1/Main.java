package Desafio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Desafio1Pessoa> listaDeDesafio1Pessoas = new ArrayList<>();
        var pessoa1 = new Desafio1Pessoa();
        var pessoa2 = new Desafio1Pessoa();
        var pessoa3 = new Desafio1Pessoa();
        pessoa1.setNome("Gabriel");
        pessoa1.setIdade(20);
        pessoa1.setCodigo(1);
        listaDeDesafio1Pessoas.add(pessoa1);

        pessoa2.setNome("Ingrid");
        pessoa2.setIdade(25);
        pessoa2.setCodigo(2);
        listaDeDesafio1Pessoas.add(pessoa2);

        pessoa3.setNome("Zé");
        pessoa3.setIdade(8);
        pessoa3.setCodigo(3);
        listaDeDesafio1Pessoas.add(pessoa3);

        int opcao;
        int codigo;
        System.out.println("\nA lista possui " + listaDeDesafio1Pessoas.size() + " pessoas.");
        System.out.println("Qual pessoa quer listar?\n" +
                "1-todas.\n" +
                "2-listar por codigo.");
        opcao = scan.nextInt();
        switch(opcao) {
            case 1 -> listaDeDesafio1Pessoas.forEach(System.out::println);
            case 2 -> {
                System.out.println("Digite o código da pessoa: ");
                codigo = scan.nextInt();
                Desafio1Pessoa desafio1PessoaEncontrada = listaDeDesafio1Pessoas.stream()
                        .filter(p -> p.getCodigo() == codigo)
                        .findFirst()
                        .orElse(null);
                if (desafio1PessoaEncontrada != null) {
                    System.out.println("Desafio1.Pessoa encontrada.\n" + desafio1PessoaEncontrada);
                } else if (desafio1PessoaEncontrada == null) {
                    System.out.println("Não existe uma pessoa com esse código na lista.");
                }
            }
            default -> System.out.println("Opção inválida");
            }
            scan.close();
        }
    }