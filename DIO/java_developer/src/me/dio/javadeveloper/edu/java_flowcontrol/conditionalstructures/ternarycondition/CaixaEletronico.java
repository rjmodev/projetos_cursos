package me.dio.javadeveloper.edu.java_flowcontrol.conditionalstructures.ternarycondition;

import java.util.Scanner;

public class CaixaEletronico {
    //Condicional Ternário
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 50.0;
        System.out.println("\nO saldo atual em conta é: " + saldo);

        System.out.println("Digite o valor a ser sacado: ");
        double valorSolicitado = sc.nextDouble();

        String resultadoSaldo = valorSolicitado < saldo ?
                "Saldo atualizado: " + (saldo = saldo - valorSolicitado)
                : "Saldo insuficiente!";

        System.out.println(resultadoSaldo);

    }
}
