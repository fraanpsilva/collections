package br.com.dio.repetitionestructures.exercicios.loops;

import java.util.Scanner;

public class Ex5_Tabuada {

    public static void main(String[] args) {

        /*
         * Desenvolva um gerador de tabuada de qualquer número inteiro entre 1 e 10.
         * O usuário deve informar de qual número ele deseja ver a tabuada.
         * A saída deve ser conforme o exemplo abaixo:
         *
         * Tabuada de 5:
         * 5 x 1 = 5
         * 5 x 2 = 10
         * ...
         * 5 x 10 = 50
         * */

        Scanner scan = new Scanner(System.in);

        int numeroTabuada;

        System.out.println("Qual número deseja ver a tabuada? ");
        numeroTabuada = scan.nextInt();

        System.out.println("Tabuada de " + numeroTabuada);
        for (int i = 0; i <= 10; i++){
            System.out.println(numeroTabuada + " X " + i + " = " + (numeroTabuada * i));

        }
    }
}
