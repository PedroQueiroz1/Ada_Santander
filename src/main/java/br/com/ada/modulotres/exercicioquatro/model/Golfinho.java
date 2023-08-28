package br.com.ada.modulotres.exercicioquatro.model;

public class Golfinho extends Animal implements Aquatico, Mamifero {

    @Override
    public void comer() {
        System.out.println("Golfinho comendo...");
    }

    @Override
    public void dormir() {
        System.out.println("Golfinho dormindo...");
    }

    @Override
    public void nadar() {
        System.out.println("Golfinho nadando...");
    }

    @Override
    public void respirarEmBaixoDagua() {
        System.out.println("Golfinho indo à superfície para respirar...");
    }

    @Override
    public void parir() {
        System.out.println("Golfinho parindo...");
    }

    @Override
    public void produzirLeite() {
        System.out.println("Golfinho produzindo leite...");
    }

}
