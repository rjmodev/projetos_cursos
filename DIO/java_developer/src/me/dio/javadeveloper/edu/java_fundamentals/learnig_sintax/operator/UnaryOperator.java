package me.dio.javadeveloper.edu.java_fundamentals.learnig_sintax.operator;

public class UnaryOperator {
    public static void main(String[] args) {
    //Esses operadores são aplicados juntamente com um outro operador aritmético (+ - * !).
        int numero = 1024;

        numero = - numero;

        System.out.println(- numero);

        System.out.println(numero);

        numero = + numero;

        System.out.println(numero);

        //Conversão de número negativo para número positivo

        numero = numero * -1;

        System.out.println(numero);

    }
}
