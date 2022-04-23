package br.com.dio.repetitionestructures.exercicios.arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {

    public static void main(String[] args) {

        /*
        * Faça um programa que leia 20 numeros aleatórios entre 0 e 100, armaze-os num vetor.
        * Ao final mostre os números e seus sucessores.
        * */

        Random random = new Random();
        int[] numAleatorios = new int[20];

        // colocando os numeros dentro do array
        for (int i = 0; i < numAleatorios.length; i++){
            int numero = random.nextInt(100);
            numAleatorios[i] = numero;
        }

        // imprimindo o número gerado
        System.out.print("Números aleatorios gerados: ");
        for ( int num: numAleatorios) {
            System.out.print(num + " ");

        }

        // imprimindo o número sucessor dos números gerados
        System.out.print("\nAntecessores dos números aleatorios:");
        for ( int num: numAleatorios) {
            System.out.print((num -  1) +  " ");

        }

        // imprimindo o número sucessor dos números gerados
        System.out.print("\nSucessores dos números aleatorios:");
        for ( int num: numAleatorios) {
            System.out.print((num + 1) +  " ");

        }

    }
}
