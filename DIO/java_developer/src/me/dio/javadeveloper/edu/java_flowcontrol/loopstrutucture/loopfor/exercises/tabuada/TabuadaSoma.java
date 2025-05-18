package me.dio.javadeveloper.edu.java_flowcontrol.loopstrutucture.loopfor.exercises.tabuada;

public class TabuadaSoma {
    public static void main(String[] args) {

        System.out.println("\nTABUADA DE ADIÇÃO DE 1 A 10");
        System.out.println("######################################");
        for (int num = 0; num <= 10 ; num++) {
            System.out.printf("Tabuada de %d", num);
            for (int num2 = 0; num2 <= 10; num2++) {
                int sumResult = num + num2;
                System.out.printf("%n%d x %d = %d", num, num2, sumResult);
            }
            System.out.print("\n----------------------------------------\n");
        }

    }
}
