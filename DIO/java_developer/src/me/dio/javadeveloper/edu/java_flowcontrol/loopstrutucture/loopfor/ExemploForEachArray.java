package me.dio.javadeveloper.edu.java_flowcontrol.loopstrutucture.loopfor;

public class ExemploForEachArray {
    public static void main(String[] args) {
        String[] carros = {"Corsa", "Palio", "Fusca", "Corolla"};

        for (String carro: carros) {
            System.out.println("O carro é " + carro + ".");
            //System.out.println(carro);
        }
    }
}
