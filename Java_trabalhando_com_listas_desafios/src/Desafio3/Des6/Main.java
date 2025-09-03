package Desafio3.Des6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Desafio3ContaBancaria> listaContas = new ArrayList<>();
        Desafio3ContaBancaria conta1 = new Desafio3ContaBancaria(1, 230.40);
        Desafio3ContaBancaria conta2 = new Desafio3ContaBancaria(2, 321.34);
        Desafio3ContaBancaria conta3 = new Desafio3ContaBancaria(3, 190.90);
        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);
        Desafio3ContaBancaria contaMaior = listaContas.get(0);
        for(Desafio3ContaBancaria conta : listaContas){
            if (conta.getSaldo() > contaMaior.getSaldo()){
                contaMaior = conta;
            }
        }
        System.out.println("Conta com maior saldo: " + contaMaior.getNumero() + " - R$ " + contaMaior.getSaldo());
    }
}
