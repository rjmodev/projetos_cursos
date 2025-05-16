package me.dio.javadeveloper.edu.java_fundamentals.learnig_sintax.types_variables;

public class TiposVariaveis {
    public static void main(String[] args) {
    /* Para representar números, na grande maioria das vezes utilizaremos o tipo
    int para representar números inteiros ou double para representar números fracionados.*/
        //Exemplos de declarações de váriaveis:
        int metros; //Tipo "int", nome "metros", com nenhum valor atribuído.
        int anoNascimento = 1955; //tipo "int", nome "anoNascimento", com valor 1955
        double metragemInternaQuarto = 8.87; //tipo "double", nome "metragemInternaQuarto", valor 8.87.

        //Outros exemplos
        byte alturaMontanha = 115;
        short anoFinalGraduacao = 2028;
        int cep = 3795000; //se começar com zero, talvez tenha que ser outro tipo

        //O tipo long precisa terminar com L
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo

        //O tipo float precisa terminar com F
        float PI = 3.14F;
        double salario = 3530.55;

        //Java é fortemente "tipado"
        //Mais exemplos sobre isso:
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
    }
}
