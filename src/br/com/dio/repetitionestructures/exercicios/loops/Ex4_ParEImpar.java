package br.com.dio.repetitionestructures.exercicios.loops;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {

        /*
        * Faça um programa que peça N números inteiros, calsule e mostre a quantidade
        * de números pares e a quantidade de números impares
        * */

        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int count = 0;
        int quantPares = 0, quantImpar =0;

        System.out.print("Quantidade de números: ");
        quantNumeros = scan.nextInt();
        
        do {
            System.out.print("Escreva o número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0){
                quantPares++;
            } else {
                quantImpar++;
            }
            count ++;

        } while (count < quantNumeros);

        System.out.println("\nQuantidade de pares: " + quantPares);
        System.out.println("Quantidade de impares: " + quantImpar);
    }
}
