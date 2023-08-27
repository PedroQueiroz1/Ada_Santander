package br.com.ada.modulotres.exerciciotres.model;

public class Pessoa {

    private String nome;

    private Byte idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Byte getIdade() {
        return idade;
    }

    public void setIdade(Byte idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome + " (" + idade + " anos)";
    }
}
