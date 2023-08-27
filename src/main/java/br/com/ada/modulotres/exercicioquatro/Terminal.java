package br.com.ada.modulotres.exercicioquatro;

import br.com.ada.modulotres.exerciciotres.model.Pessoa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
    Criar classes para os animais Tilapia,
    Pardal, Vaca, Morcego, Golfinho, Ornitorrinco,
    utilizando a classes bases da aula.
 */
public class Terminal {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>(Arrays.asList(
                criarPessoa("Pedro", (byte) 24),
                criarPessoa("Esther", (byte) 26),
                criarPessoa("Qualquer nome", (byte) 75),
                criarPessoa("Pessoa 4", (byte) 44)
        ));

        pessoas.sort(Comparator.comparing(Pessoa::getIdade));

        System.out.println(pessoas.toString());
    }

    public static Pessoa criarPessoa(String nome, Byte idade) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        return pessoa;
    }
}
