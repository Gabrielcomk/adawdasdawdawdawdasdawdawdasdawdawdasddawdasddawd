package Desafio3.Des4;

public class Desafio3Produto {
    String nome;
    Double preco;


    public Desafio3Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "\nNome: " + nome + "\n" +
                "Preço: " + preco;
    }
}
