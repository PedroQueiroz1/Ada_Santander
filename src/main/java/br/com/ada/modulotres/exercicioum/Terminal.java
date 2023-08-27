package br.com.ada.modulotres.exercicioum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
    Ordenar lista de palavras
 */
public class Terminal {

    public static void main(String[] args) {

        List<String> listaPalavras = new ArrayList<String>(Arrays.asList("ada", "santander", "coders"));

        Collections.sort(listaPalavras);

        System.out.println(listaPalavras);

    }
}
