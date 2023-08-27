package br.com.ada.modulodois.exercicioum;

import br.com.ada.modulodois.exercicioum.model.Pessoa;

/*
    Construa o código Java para definir um objeto do tipo pessoa
    que possui as seguintes características (nome,idade,altura,peso).
 */
public class Terminal {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Pedro");
        pessoa.setIdade(24);
        pessoa.setAltura(1.74);
        pessoa.setPeso(80.0);

        System.out.println("Nome: " + pessoa.getNome() + "\n"
                            + "Idade: " + pessoa.getIdade() + " anos \n"
                            + "Altura: " + pessoa.getAltura() + " metros \n"
                            + "Peso: " + pessoa.getPeso() + " kgs");
    }
}
