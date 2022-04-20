package br.com.dio.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoList {

    /*Dado as seguintes informações sobre meus gatos, crie uma lista e ordene esta lista exibindo
    * (nome - idade - cor)
    *
    * Gato 1 = nome: Jon, idade = 18, cor: preto
    * Gato 2 = nome: Simba, idade = 6, cor: tigrado
    * Gato 3 = nome: Jon, idade = 12, cor: amarelo
    * */


    public static void main(String[] args) {



        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "Preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};


        System.out.println("---\tOrdem de inserção\t---");
        System.out.println(meusGatos + "\n");

        System.out.println("---\tOrdem aleatória\t---");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos + "\n");

        System.out.println("---\tOrdem natural\t---");
        Collections.sort(meusGatos);
        System.out.println(meusGatos + "\n");


        // utlizando o Comparator
        System.out.println("---\tOrdem de idade\t---");
        //Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos + "\n");

        System.out.println("---\tOrdem de cor\t---");
        //Collections.sort(meusGatos, new ComparatorCor());
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos + "\n");

        System.out.println("---\tOrdem de nome/cor/idade\t---");
        //Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos + "\n");

    }

}

class Gato implements Comparable<Gato>{
    // estudar sobre a interface Comparable

    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome: '" + nome + '\'' +
                ", idade: " + idade +
                ", cor: '" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}


class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato gato1, Gato gato2) {
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }


}

class ComparatorCor implements Comparator<Gato>{
    @Override
    public int compare(Gato gato1, Gato gato2) {
        return gato1.getCor().compareToIgnoreCase(gato2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato gato1, Gato gato2) {
        int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
        if (nome != 0)  return nome;

        int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());
        if (cor != 0) return cor;

        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
}