package br.com.ada.modulotres.exercicioquatro.model;

public class Pardal extends Animal implements Ave {
    @Override
    public void comer() {
        System.out.println("Pardal comendo...");
    }

    @Override
    public void dormir() {
        System.out.println("Pardal dormindo...");
    }

    @Override
    public void voar() {
        System.out.println("Pardal voando...");
    }

    @Override
    public void botarOvos() {
        System.out.println("Pardal botando ovos...");
    }

}
