package me.dio.javadeveloper.edu.java_flowcontrol.conditionalstructures.ternarycondition;

import java.util.Scanner;

public class ResultadoEscolar {
    //Condicional Ternário
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite a nota do aluno: ");
        int notaAluno = sc.nextInt();

//        if (notaAluno >= 7) {
//            System.out.println("O aluno foi aprovado!");
//        } else {
//            System.out.println("O aluno foi reprovado!");
//        }

        String resultadoNota = (notaAluno >= 7 ? "aprovado" :
                (notaAluno >= 5 && notaAluno < 7) ? "para recuperação" :
                        "reprovado");

        System.out.println("O aluno foi " + resultadoNota + "!");

    }
}
