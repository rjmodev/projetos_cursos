package me.dio.javadeveloper.edu.java_flowcontrol.conditionalstructures.simpleconditional;

import java.util.Scanner;

public class CaixaEletronico {
    //Condicional Simples
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 50.0;
        System.out.println("O saldo atual em conta é: " + saldo);

        System.out.println("\nDigite o valor a ser sacado: ");
        double valorSolicitado = sc.nextDouble();

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saldo atualizado: " + saldo);
        }
    }
}
