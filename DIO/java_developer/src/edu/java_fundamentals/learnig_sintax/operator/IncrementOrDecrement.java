package edu.java_fundamentals.learnig_sintax.operator;

public class IncrementOrDecrement {
    public static void main(String[] args) {

        //x repetições para incrementar valores, para reatribuições de valores
        int incremento = 75;

        //x repeticao incremento
        incremento = ++incremento;

        System.out.println (incremento ++);
        System.out.println(incremento);

        //x repetições para decrementar valores, para reatribuições de valores
        int decremento = 48;

        //x repeticao incremento
        decremento = --decremento;

        System.out.println (decremento --);
        System.out.println(decremento);

        //Inversão de expressões booleanas (!) True or False
        boolean inversao = true;
        inversao =  !inversao;
        System.out.println(!inversao);
        System.out.println(inversao);
    }
}
