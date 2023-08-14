package br.com.ada.exercicioquatro;

import br.com.ada.exerciciodois.util.CalculadoraUtil;
import br.com.ada.exercicioquatro.model.ObjetoAleatorio;
import br.com.ada.exercicioquatro.util.ObjetoUtil;

/*
    Faça um programa para calcular a aceleração adquirida
    de um determinado objeto de acordo com a sua força e massa,
    recordando que F=M.A. O objeto deverá possuir como características força e massa.

    Exemplo: Um carro com força de 2000N(Newton)
    e 200 kg de massa deverá possuir 10 m/s² de aceleração pois:

    F=M.A

    2000=200.a = 2000/200 = a = 10m/s²
 */
public class Terminal {

    public static void main(String[] args) {
        ObjetoAleatorio objetoAleatorio = new ObjetoAleatorio();
        ObjetoUtil objetoUtil = new ObjetoUtil();

        objetoAleatorio.setForca(2000.0);
        objetoAleatorio.setMassa(200.0);

        Double aceleracao = objetoUtil.calcularAceleracao(objetoAleatorio.getForca(), objetoAleatorio.getMassa());

        System.out.format("Aceleração: %.1f m/s² ", aceleracao);
    }
}
