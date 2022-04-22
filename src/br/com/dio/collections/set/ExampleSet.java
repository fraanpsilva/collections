package br.com.dio.collections.set;

import java.util.*;

public class ExampleSet {
    public static void main(String[] args) {

        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//    Set notas = new HashSet(); // antes do java 5
//    Set<Double> notas = new HashSet<>(); // Generics(jdk 5) - Diamont Operator (jdk 7)
//    HashSet<Double> notas = new HashSet<>();
//    Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
//        Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
//        notas.add(1d);
//        notas.remove(5d);
//        System.out.println(notas);

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas + "\n");

        // não podemos trabalhar com posições e substituições no set
//        System.out.println("Exiba a posição da nota 5.0: ");
//        System.out.println("Adicione na lista a nota 8,0 na posição 4: ");
//        System.out.println("Substitua a nota 5.0 pela nota 6.0");//
//        System.out.println("Exiba a terceira nota adicionada: ");
//        System.out.println("Remova a nota na posição 0: ");


        System.out.println("Confira se a nota 5.0 esta no conjunto: " + notas.contains(5d) + "\n");
        System.out.println("Exiba a menor nota: " + Collections.min(notas) + "\n");
        System.out.println("Exiba a maior nota: " + Collections.max(notas) + "\n");
        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma dos valores é: " + soma + "\n");


        System.out.println("Exiba a media dos valores: " + (soma / notas.size()) + "\n");

        System.out.println("Remova a nota 0.0: ");
        notas.remove(0d);
        System.out.println(notas + "\n");

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");


    }










}