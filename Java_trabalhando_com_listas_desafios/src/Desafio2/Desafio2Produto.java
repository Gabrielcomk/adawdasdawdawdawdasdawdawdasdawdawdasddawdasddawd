package Desafio2;

public class Desafio2Produto {
    private int codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nCódigo do Produto: " + codigo + "\n" +
                "nome: " + nome + "\n" +
                "preço: R$ " + preco + "\n" +
                "quantidade: " + quantidade + "";
    }

    public Desafio2Produto(int codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}
