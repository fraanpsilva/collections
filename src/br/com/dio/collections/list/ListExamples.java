package br.com.dio.collections.list;

import java.util.*;

public class ListExamples {
    public static void main(String[] args) {

        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
        //List notas = new ArrayList(); // antes do java 5
        //List<Double> notas = new ArrayList<>(); // Generics(jdk 5) - Diamond Operator(jdk7)
        //ArrayList<Double> notas = new ArrayList<>(); // não recomendado
        //List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        /*// forma valida, porém limitada pois não pode adicionar e nem retirar elementos, mas pode usar outros métodos
        List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);*/

        /*// esta forma torna a lista imutáveis, tbm não pode adicionar e nem remover elementos, mas pode usar outros métodos
        List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        System.out.println(notas);
        //System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d) + "\n");

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas + "\n");

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas + "\n");

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d) + "\n") ;

        System.out.println("Exiba toas as notas na ordem em que foram informadas: ");
        for (Double nota: notas) System.out.println(nota);
        System.out.println("\n");

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2) + "\n");

        System.out.println("Exiba a menor nota: " + Collections.min(notas) + "\n");
        System.out.println("Exiba a maior nota: " + Collections.max(notas) + "\n");

        // Exibindo a soma dos valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("Exiba a soma dos valores: " + soma + "\n") ;

        System.out.println("Exiba a média das notas: " + (soma/notas.size()) + "\n");

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas + "\n");

        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0 );
        System.out.println(notas + "\n");

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7){
                iterator1.remove();
            }
        }
        System.out.println(notas + "\n");

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas + "\n");


        System.out.println("Confira se a lista está vazia");
        System.out.println(notas.isEmpty());
    }
}
