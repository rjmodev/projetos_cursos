package me.dio.javadeveloper.edu.java_flowcontrol.loopstrutucture.BreakContinue;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        //ver saída no console debugando para compreender melhor o break
        for (int numero = 0; numero <= 10; numero++) {
            System.out.println(numero + 1);
            if (numero == 3) {
                break;
            }
        }
        //ver saída no console debugando para compreender melhor o continue
        for (int numero = 0; numero <= 10; numero++) {
            System.out.println(numero + 1);
            if (numero == 3) {
                continue;
            }
        }
    }
}
