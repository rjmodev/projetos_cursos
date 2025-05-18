package me.dio.javadeveloper.edu.java_flowcontrol.loopstrutucture.looparray;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploArray {
    /**
     * Criar um algoritmo que leia dados para um vetor de 100
     * elementos inteiros. Imprimir o maior e o menor, sem ordenar.
     */
    public static void main(String[] args) {
        int[] number = new int[100];

        for (int i = 0; i < number.length; i++) {
            number[i] = (int)((Math.random()+0.01) * 100);
            System.out.println(number[i]);
        }

        int numberGreater = number[0];
        int numberSmaller = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] > numberGreater) {
                numberGreater = number[i];
            } else if (number[i] < numberSmaller) {
                numberSmaller = number[i];
            }
        }

        System.out.println("\nO menor número é: " + numberSmaller);
        System.out.print("O maior número é: " + numberGreater);
    }
}
