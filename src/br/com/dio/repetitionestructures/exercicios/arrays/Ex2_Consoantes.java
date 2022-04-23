package br.com.dio.repetitionestructures.exercicios.arrays;

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {

        /*
        * Faça um progama que leia um vetor de 6 caracteres, e diga
        * quantas consoantes foram lidas. Imprima as consoantes.
        * */

        Scanner scan = new Scanner(System.in);

        // criando um array indicando apenas o tamanho
        String[] letras = new String[6];
        int quantCons = 0;

        int count = 0;
        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u"))){

                letras[count] = letra;
                quantCons++;
            }
            count++;

        } while (count < letras.length);

        for (String consoante : letras){
            if (consoante != null){
                System.out.print(consoante + " ");

            }

        }

        System.out.println("\nQuantidade de consoantes: " + quantCons);
    }
}
