package br.com.ada.modulotres.exercicioquatro.model;

public class Tilapia extends Animal implements Aquatico {

    @Override
    public void comer() {
        System.out.println("Tilápia comendo...");
    }

    @Override
    public void dormir() {
        System.out.println("Tilápia dormindo...");
    }

    @Override
    public void nadar() {
        System.out.println("Tilápia nadando...");
    }

    @Override
    public void respirarEmBaixoDagua() {
        System.out.println("Tilápia respirando embaixo d´água...");
    }
}
