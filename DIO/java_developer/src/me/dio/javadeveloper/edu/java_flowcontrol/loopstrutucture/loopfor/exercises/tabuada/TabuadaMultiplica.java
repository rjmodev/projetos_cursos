package me.dio.javadeveloper.edu.java_flowcontrol.loopstrutucture.loopfor.exercises.tabuada;

public class TabuadaMultiplica {
    public static void main(String[] args) {

        System.out.println("\nTABUADA DE MULTIPLICAÇÃO DE 1 A 10");
        System.out.println("######################################");
        for (int num = 0; num <= 10 ; num++) {
            System.out.printf("Tabuada de %d", num);
            for (int num2 = 0; num2 <= 10; num2++) {
                int multResult = num * num2;
                System.out.printf("%n%d x %d = %d", num, num2, multResult);
            }
            System.out.print("\n----------------------------------------\n");
        }
    }
}
