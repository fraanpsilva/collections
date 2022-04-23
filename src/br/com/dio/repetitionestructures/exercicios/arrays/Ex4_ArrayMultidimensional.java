package br.com.dio.repetitionestructures.exercicios.arrays;

import java.util.Random;

public class Ex4_ArrayMultidimensional {

    public static void main(String[] args) {

        /*
         * Gere e imprima uma matriz M 4 x 4 com valores aleatorios entre 0-9
         * */

        Random random = new Random();
        int [][] M = new int[4][4]; // criando uma matriz

        for (int i = 0; i < M.length; i++){
            for (int j = 0; j < M[i].length; j++){
                M[i][j] = random.nextInt(9);
            }


        }

        for ( int[] linha : M ) {
            for ( int elementoColuna : linha) {
                System.out.print(elementoColuna + " ");
            }
            System.out.println();

        }


    }


}
