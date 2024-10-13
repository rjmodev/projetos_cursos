package edu.java_fundamentals.learnig_sintax.operator;
/* O operador aritmético é utilizado para realizar operações matemáticas entre
valores numéricos, podendo se tornar ou não uma expressão mais complexa.
 */
public class OperatorAritmetic {
    public static void main(String[] args) {
        double soma = 43.8 + 59.7;
        int subtracao = 532 - 211;
        int multiplicacao = 33 * 25;
        int divisao = 1562 / 26;
        //Operador modulo(%) utilizado para representar o resto de uma divisão
        int modulo = 1024 % 128;
        double resultado = (15 * 7) + (45 / 9);

        //ATENÇÃO! O operador de adição (+), quando utilizado em variáveis do tipo texto,
        // realizará a “concatenação de textos”.

        String nomeCompleto = "Linguagem " + "Java";
        System.out.println(nomeCompleto);

        //Concatenação e suas variações. Exemplo nas expressoes abaixo:

        String concatenacao = "?";

        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);

        System.out.println(concatenacao);

    }
}
