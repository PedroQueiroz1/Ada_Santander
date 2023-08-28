package br.com.ada.modulotres.exercicioquatro.model;

public class Morcego extends Animal implements Mamifero {


    @Override
    public void comer() {
        System.out.println("Morcego comendo...");
    }

    @Override
    public void dormir() {
        System.out.println("Morcego dormindo...");
    }

    @Override
    public void parir() {
        System.out.println("Morcego parindo...");
    }

    @Override
    public void produzirLeite() {
        System.out.println("Morcego produzindo leite...");
    }
}
