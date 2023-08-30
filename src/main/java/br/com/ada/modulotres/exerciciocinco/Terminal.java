package br.com.ada.modulotres.exerciciocinco;

public class Terminal {

    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        System.out.println("Maior entre [" + a + "] e [" + b + "] é: [" + maior(a, b) + "]");
    }

    private static String maior(String primeira, String segunda) {
        if (primeira.compareTo(segunda) == 0) {
            return primeira;
        } else {
            return segunda;
        }
    }
}
