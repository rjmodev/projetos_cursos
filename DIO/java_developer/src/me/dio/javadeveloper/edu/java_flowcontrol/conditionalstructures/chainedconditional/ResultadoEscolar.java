package me.dio.javadeveloper.edu.java_flowcontrol.conditionalstructures.chainedconditional;

import java.util.Scanner;

//Condicional Encadeada
public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite a nota do aluno: ");
        int notaAluno = sc.nextInt();

        if (notaAluno >= 7) {
            System.out.println("O aluno foi aprovado!");
        } else if (notaAluno >= 5 && notaAluno < 7) {
            System.out.println("O aluno ficou de recuperação!");
        } else {
            System.out.println("O aluno foi reprovado!");
        }
    }
}
