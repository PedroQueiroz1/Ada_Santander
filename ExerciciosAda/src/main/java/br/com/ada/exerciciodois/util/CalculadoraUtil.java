package br.com.ada.exerciciodois.util;

public class CalculadoraUtil {

    public Double somar(Double valor1, Double valor2) {
        return valor1 + valor2;
    }

    public Double subtrair(Double valor1, Double valor2) {
        return valor1 - valor2;
    }

    public Double multiplicar(Double valor1, Double valor2) {
        return valor1 * valor2;
    }

    public Double dividir(Double valor1, Double valor2) {
        if (valor2 != 0) {
            return valor1 / valor2;
        } else {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
    }
}
