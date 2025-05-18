package me.dio.javadeveloper.edu.java_fundamentals.learnig_sintax.operators;

public class Tenary {
    public static void main(String[] args) {
    //O Operador de Condição Ternária (</>?</>:</>) é uma forma resumida para definir uma
    // condição e escolher por um dentre dois valores.
    // <Expressão Condicional> ? <Caso a condição seja true> : <Caso a condição seja false>;

        int valorDaVariavelA, valorDaVariavelB;
        valorDaVariavelA = 15;
        valorDaVariavelB = 32;
        String resultadoTernario = valorDaVariavelA == valorDaVariavelB ? "Verdadeiro" : "Falso";
        int resultadoTernarioValor = valorDaVariavelA == valorDaVariavelB ? valorDaVariavelA : valorDaVariavelB;
        System.out.println("O resultado verificado em sistema é " + resultadoTernario + " com o valor de " + resultadoTernarioValor);

        //EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE

        int valorDaVariavelC, valorDaVariavelD;
        valorDaVariavelC = 59;
        valorDaVariavelD = 59;
        String resultadoIfElse = "";
        int resultadoIfElseValor;

        if(valorDaVariavelC == valorDaVariavelD)
            resultadoIfElse = "Verdadeiro";
        else
            resultadoIfElse = "Falso";

        if(valorDaVariavelC == valorDaVariavelD)
            resultadoIfElseValor = valorDaVariavelC;
        else
            resultadoIfElseValor = valorDaVariavelD;

        System.out.println("O resultado verificado em sistema é " + resultadoIfElse + " com o valor de " + resultadoIfElseValor);
    }
}
