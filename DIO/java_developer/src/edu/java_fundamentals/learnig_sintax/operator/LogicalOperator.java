package edu.java_fundamentals.learnig_sintax.operator;

public class LogicalOperator {
    public static void main(String[] args) {
    //Os operadores lógicos representam o recurso que nos permite criar expressões lógicas maiores a partir da
    //junção de duas ou mais expressões. (AND = && ; OR = || )
        boolean condicaoLogica_1 = true;
        boolean condicaoLogica_2 = true;

        if (condicaoLogica_1 && condicaoLogica_2){
            System.out.println("De acordo com as condições lógicas apresentadas, ambas são verdadeiras");
            }
        if (condicaoLogica_1 || condicaoLogica_2) {
            System.out.println("De acordo com as condições lógicas apresentadas, somente uma é verdadeira ou ambas");
            }
        if (condicaoLogica_1 || ( 105 > 67 )) {
            System.out.println("De acordo com as condições lógicas apresentadas, somente uma é verdadeira ou ambas");
            }
            System.out.println("Fim");

    // ComparacaoAvancada.java

        int numero1 = 1;
        int numero2 = 1;

        if(numero1 == 2 & numero2 ++ == 2 )
                System.out.println("As 2 condições são verdadeiras");

            System.out.println("O numero 1 agora é " + numero1);
            System.out.println("O numero 2 agora é " + numero2);
    }
}
