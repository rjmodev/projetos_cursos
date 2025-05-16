package me.dio.javadeveloper.edu.java_flowcontrol.loopstrutucture.loopfor;

public class ExemploForArray {
    public static void main(String[] args) {
        String[] alunos = {"Adriana", "Guilherme", "Célio", "Luciano"};

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno do indice " + i + " é " + alunos[i] + ".");
            //System.out.println(alunos[i]);
        }
    }
}
