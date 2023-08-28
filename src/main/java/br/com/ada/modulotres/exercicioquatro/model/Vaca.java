package br.com.ada.modulotres.exercicioquatro.model;

public class Vaca extends Animal implements Mamifero {

    @Override
    public void comer() {
        System.out.println("Vaca comendo...");
    }

    @Override
    public void dormir() {
        System.out.println("Vaca dormindo...");
    }

    @Override
    public void parir() {
        System.out.println("Vaca parindo...");
    }

    @Override
    public void produzirLeite() {
        System.out.println("Vaca produzindo leite...");
    }
}
