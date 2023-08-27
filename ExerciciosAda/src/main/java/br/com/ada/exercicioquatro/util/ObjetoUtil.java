package br.com.ada.exercicioquatro.util;

public class ObjetoUtil {

    public Double calcularAceleracao(Double forca, Double massa) {
        if (massa != 0) {
            return forca / massa;
        } else {
            throw new ArithmeticException("Não é possível um objeto existir com massa igual a 0.");
        }
    }
}
