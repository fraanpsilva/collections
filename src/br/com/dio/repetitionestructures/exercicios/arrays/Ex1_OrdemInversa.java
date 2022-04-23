package br.com.dio.repetitionestructures.exercicios.arrays;

public class Ex1_OrdemInversa {

    public static void main(String[] args) {

        /*
        * Crie um vetor de 6 números inteiros e mostre-os na ordem inversa
        * */

        // declarando um vetor unidimensional, com seus elementos
        int[] vetor = {-5, -6, 15, 50, 8, 4};

        System.out.println("Vetor: ");
        int count = 0;
        while (count <= vetor.length - 1){
            System.out.print(vetor[count] + " ");
            count++;

        }

        // pegando o vetor na ordem inversa
        System.out.println("\nVetor na ordem inversa: ");
        for (int i = vetor.length - 1; i >= 0; i-- ){
            System.out.print(vetor[i] + " ");

        }



    }
}
