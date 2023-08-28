package br.com.ada.modulotres.exercicioquatro.model;

public class Ornitorrinco extends Animal implements Aquatico, Mamifero {

    @Override
    public void comer() {
        System.out.println("Ornitorrinco comendo...");
    }

    @Override
    public void dormir() {
        System.out.println("Ornitorrinco dormindo...");
    }

    @Override
    public void nadar() {
        System.out.println("Ornitorrinco nadando...");
    }

    @Override
    public void respirarEmBaixoDagua() {
        System.out.println("Ornitorrinco indo à superfície para respirar...");
    }

    @Override
    public void parir() {
        System.out.println("Ornitorrinco parindo...");
    }

    @Override
    public void produzirLeite() {
        System.out.println("Ornitorrinco produzindo leite...");
    }
}
