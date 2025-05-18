package me.dio.javadeveloper.edu.java_flowcontrol.loopstrutucture.loopwhile;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    /**
     * Joãozinho recebeu R$ 50,00 de mesada e foi em uma loja de doces gastar todo o seu dinheiro,
     * logo, enquanto o valor dos doces não igualar a R$ 50,00 ele foi adicionando itens no carrinho.
     */
    public static void main(String[] args) {

        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.println("Doce do valor: " + valorDoce + " Adicionado ao carrinho.");
            mesada -= valorDoce;
        }
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 9);
    }
}
