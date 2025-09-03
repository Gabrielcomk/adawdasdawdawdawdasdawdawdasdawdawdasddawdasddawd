package Desafio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Desafio2ProdutoPerecivel extends Desafio2Produto {
    private LocalDate dataValidade;

    public Desafio2ProdutoPerecivel(int codigo, String nome, double preco, int quantidade, LocalDate dataValidade) {
        super(codigo, nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = (dataValidade != null) ? dataValidade.format(formato) : "Sem validade";

        return "\nCódigo do Produto: " + getCodigo() +
                "\nNome: " + getNome() +
                "\nPreço: R$ " + getPreco() +
                "\nQuantidade: " + getQuantidade() +
                "\nData de Validade: " + dataFormatada;
    }
}