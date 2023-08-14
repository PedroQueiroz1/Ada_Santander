package br.com.ada.exerciciodois;

import br.com.ada.exerciciodois.model.CalculadoraModel;
import br.com.ada.exerciciodois.printer.CalculadoraPrinter;
import br.com.ada.exerciciodois.util.CalculadoraUtil;

/*
    Descreva o código Java para definir um objeto do tipo “Calculadora” que tem
    como características um valor1 e um valor2 e possui os comportamentos de
    somar,subtrair,multiplicar e dividir.
    Cada comportamento deve retornar o valor da operação correspondente.
 */
public class Terminal {

    public static void main(String[] args) {

        CalculadoraUtil calculadoraUtil = new CalculadoraUtil();
        CalculadoraModel calculadoraModel = new CalculadoraModel();
        CalculadoraModel calculadoraModelError = new CalculadoraModel();
        CalculadoraPrinter calculadoraPrinter = new CalculadoraPrinter();

        calculadoraModel.setValor1(1.5);
        calculadoraModel.setValor2(3.0);

        calculadoraModelError.setValor1(1.0);
        calculadoraModelError.setValor2(0.0);

        Double resultadoSomar = calculadoraUtil.somar(calculadoraModel.getValor1(), calculadoraModel.getValor2());
        Double resultadoSubtrair = calculadoraUtil.subtrair(calculadoraModel.getValor1(), calculadoraModel.getValor2());
        Double resultadoMultiplicar = calculadoraUtil.multiplicar(calculadoraModel.getValor1(), calculadoraModel.getValor2());
        Double resultadoDividir = calculadoraUtil.dividir(calculadoraModel.getValor1(), calculadoraModel.getValor2());

        calculadoraPrinter.resultadoDaOperacao(resultadoSomar);
        calculadoraPrinter.resultadoDaOperacao(resultadoSubtrair);
        calculadoraPrinter.resultadoDaOperacao(resultadoMultiplicar);
        calculadoraPrinter.resultadoDaOperacao(resultadoDividir);

        try {
            Double resultadoDividirPorZero = calculadoraUtil.dividir(calculadoraModelError.getValor1(), calculadoraModelError.getValor2());
            calculadoraPrinter.resultadoDaOperacao(resultadoDividirPorZero);
        } catch (ArithmeticException e) {
            System.out.println("Erro ao dividir!!! " + e.getMessage());
        }

    }

}
