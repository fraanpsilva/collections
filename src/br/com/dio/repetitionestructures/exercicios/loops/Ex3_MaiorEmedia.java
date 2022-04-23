package br.com.dio.repetitionestructures.exercicios.loops;

import java.util.Scanner;

public class Ex3_MaiorEmedia {

    public static void main(String[] args) {

        /*
        * Faça um programa que leia 5 números e informe o maior numero
        * e a média desses números
        * */

        Scanner scan = new Scanner(System.in);

        int numero;

        int count = 0;
        int numeroMaior = 0;
        int soma = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > numeroMaior){
                numeroMaior = numero;
            }

            count += 1;

        } while (count < 5);

        System.out.println("\nO maior número é: " + numeroMaior);
        System.out.println("\nA media dos valores é: " + soma / 5);
    }
}
