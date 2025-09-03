package Desafio1;

public class Desafio1Pessoa {
    private int codigo;
    private String nome;
    private int idade;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "\nCódigo da pessoa: " + codigo + "\n" +
                "nome: " + nome + "\n" +
                "idade: " + idade + "";
    }

    public int getCodigo() {
        return codigo;
    }
}
