package br.com.ada.modulodois.exerciciotres;

import java.util.Scanner;

/*
    Faça um programa que receba um número como entrada
    e informe ao usuário se o número é impar ou par.
    Para determinar se o número é impar ou par, você deve criar uma classe que represente este cálculo.
 */
public class Terminal {

    public static void main(String[] args) {

        Calculo calculo = new Calculo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro para verificar se é par ou ímpar.");
        Integer numero = sc.nextInt();

        calculo.verificarParImpar(numero);

    }
}
