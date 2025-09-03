package Desafio4.Des2_3;

public class Titulo implements Comparable<Titulo> {
String nome;
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }
}
 