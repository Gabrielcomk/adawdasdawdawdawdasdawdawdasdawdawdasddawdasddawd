package Desafio3.Des5;

public class Desafio3Circulo implements Desafio3Forma {
    public String nome;
double raio;
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
    public String getNome() {
        return nome;
    }
}

