package br.com.ada.modulotres.exerciciodois;

import br.com.ada.modulotres.exerciciodois.model.Pessoa;

import java.util.*;

/*
    Lista de Pessoas ordenada pelo Nome
 */
public class Terminal {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>(Arrays.asList(
                criarPessoa("Pedro"),
                criarPessoa("Esther"),
                criarPessoa("Qualquer nome"),
                criarPessoa("Pessoa 4")
        ));

        pessoas.sort(Comparator.comparing(Pessoa::getNome));

        System.out.println(pessoas.toString());
    }

    public static Pessoa criarPessoa(String nome) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        return pessoa;
    }

}
