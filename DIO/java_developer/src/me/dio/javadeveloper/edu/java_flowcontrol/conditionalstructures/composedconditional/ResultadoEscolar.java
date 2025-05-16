package me.dio.javadeveloper.edu.java_flowcontrol.conditionalstructures.composedconditional;

import java.util.Scanner;

public class ResultadoEscolar {
    //Condicional Composta
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nDigite a nota do aluno: ");
        int notaAluno = sc.nextInt();

        if (notaAluno >= 7) {
            System.out.println("O aluno foi aprovado!");
        } else {
            System.out.println("O aluno foi reprovado!");
        }
    }
}
