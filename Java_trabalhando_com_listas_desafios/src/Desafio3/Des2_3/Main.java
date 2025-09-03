package Desafio3.Des2_3;

public class Main {
    public static void main(String[] args) {
        Desafio3Animal desafio3Animal = new Desafio3Cachorro();
        if (desafio3Animal instanceof Desafio3Cachorro) {
            Desafio3Cachorro desafio3Cachorro = (Desafio3Cachorro) desafio3Animal;
        } else {
            System.out.println("O objeto não é um cachorro.");
        }
    }
}
