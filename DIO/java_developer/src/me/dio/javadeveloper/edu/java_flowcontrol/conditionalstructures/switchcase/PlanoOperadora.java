package me.dio.javadeveloper.edu.java_flowcontrol.conditionalstructures.switchcase;


import java.util.Scanner;

/**
 * Requisitos
 * Imagina que fomos requisitados a criar um sistema de plano telefônico onde:
 * <p>
 * O sistema terá 03 planos: BASIC, MIDIA , TURBO;
 * BASIC: 100 minutos de ligação;
 * MÍDIA: 100 minutos de ligação + WhatsApp e Instagram grátis;
 * TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB Youtube.
 */

public class PlanoOperadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nDigite o plano desejado pela sua letra inicial(B, M ou T): ");
        String plano = sc.next();

        //Modo condicional convencional
//        if (plano.equalsIgnoreCase("B")) {
//            System.out.println("Plano Basic: 100 minutos de ligação");
//        } else if (plano.equalsIgnoreCase("M")) {
//            System.out.println("Plano Médio:");
//            System.out.println("100 minutos de ligação + WhatsApp e Instagram grátis");
//        } else if (plano.equalsIgnoreCase("T")) {
//            System.out.println("Plano Turbo:");
//            System.out.println("100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB Youtube");
//        } else {
//            System.out.println("Plano inválido!");
//        }

        //Modo condicional com switch case
        switch (plano.toUpperCase()){
            case "T":{
                System.out.println("5 GB Youtube");
            }
            case "M":{
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "B":{
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
