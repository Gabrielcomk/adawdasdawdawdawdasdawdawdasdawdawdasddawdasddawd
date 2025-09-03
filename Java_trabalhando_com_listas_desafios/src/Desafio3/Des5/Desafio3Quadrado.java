package Desafio3.Des5;

public class Desafio3Quadrado implements Desafio3Forma {
    public String nome;
double lado;
    @Override
    public double calcularArea() {
        return lado * lado;
    }
    public String getNome() {
        return nome;
    }
}
