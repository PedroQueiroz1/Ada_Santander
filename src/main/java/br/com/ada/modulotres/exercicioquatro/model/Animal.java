package br.com.ada.modulotres.exercicioquatro.model;

public abstract class Animal {

    private String nome;
    private int idade;

    public abstract void comer();

    public abstract void dormir();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
