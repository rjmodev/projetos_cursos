package edu.java_fundamentals.learnig_sintax.operator;

public class Relational {
    public static void main(String[] args) {
    /*Os operadores relacionais avaliam a relação entre duas variáveis ou expressões.
    Neste caso, mais precisamente, definem se o operando à esquerda é igual, diferente, menor,
    menor ou igual, maior ou maior ou igual ao da direita, retornando um valor booleano como resultado.
    ( == ; != ; > ; >= ; < ; <= )
     */


        int expressaoOuNumeroA = 56;
        int expressaoOuNumeroB = 77;

        //(==) Quando desejamos verificar se uma variável é IGUAL A outra.
        boolean yesOrNo = expressaoOuNumeroA == expressaoOuNumeroB;

        System.out.println("Os números informados são iguais ou equivalentes? " + yesOrNo);

        //(!=) Quando desejamos verificar se uma variável é DIFERENTE da outra.
        yesOrNo = expressaoOuNumeroA != expressaoOuNumeroB;

        System.out.println("Os números informados são iguais ou equivalentes? " + yesOrNo);

        //Quando desejamos verificar se uma variável é MAIOR QUE a outra.
        if (expressaoOuNumeroA > expressaoOuNumeroB) {
            System.out.println("O valor de " + expressaoOuNumeroA + " é maior que " + expressaoOuNumeroB);
        }
        else
        {
            System.out.println("O valor de " + expressaoOuNumeroA + " é maior que " + expressaoOuNumeroB);
        }

        //(>=) Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
        yesOrNo = expressaoOuNumeroA >= expressaoOuNumeroB;
        System.out.println("Os números informados são iguais ou o segundo é menor em relação ao primeiro informado? " + yesOrNo);

        //Quando desejamos verificar se uma variável é MENOR QUE a outra.
        if (expressaoOuNumeroA < expressaoOuNumeroB) {
            System.out.println("O valor de " + expressaoOuNumeroA + " é menor que " + expressaoOuNumeroB);
        }

        //(<=) Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
        yesOrNo = expressaoOuNumeroA <= expressaoOuNumeroB;
        System.out.println("Os números informados são iguais ou o segundo é menor em relação ao primeiro informado? " + yesOrNo);

        //Comparação Avançada (uso de operadores relacionais com expressões)

        String expressaoOuNumero_NomeA = "Adriana";
        String expressaoOuNumero_NomeB = ("Adriana");
        //Criação de váriavel como objeto
        String expressaoOuNumero_NomeC = new String("Adriana");

        System.out.println("A aluna compareceu na aula? " + (expressaoOuNumero_NomeA == expressaoOuNumero_NomeB));
        //Metodo equals compara conteudos como objetos
        System.out.println("A aluna compareceu na aula? " + (expressaoOuNumero_NomeA.equals(expressaoOuNumero_NomeC)));

        //Outro exemplo
        int numero1 = 130;
        int numero2 = 130;
        System.out.println(numero1 == numero2); //true

        Integer numero3 = 130;
        Integer numero4 = 130;

        System.out.println(numero3 == numero4); //false

        /* A razão pela qual o resultado é false, é devido o Java tratar os valores
        Como objetos a partir de agora.
        Qual a solução ?
        Quando queremos comparar objetos, usamos o método equals
         */

        System.out.println(numero3.equals(numero4));
    }
}
