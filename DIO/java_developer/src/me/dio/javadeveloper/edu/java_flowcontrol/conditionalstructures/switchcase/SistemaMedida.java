package me.dio.javadeveloper.edu.java_flowcontrol.conditionalstructures.switchcase;
import java.util.Scanner;

public class SistemaMedida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite a sigla da unidade de medida(P, M, G ou GG): ");
        String sigla = sc.next();

        //Modo condicional com if else
//        if(sigla.equalsIgnoreCase("P")){
//            System.out.println("Pequeno");
//        }else if(sigla.equalsIgnoreCase("M")){
//            System.out.println("Médio");
//        }else if(sigla.equalsIgnoreCase("G")){
//            System.out.println("Grande");
//        }else if(sigla.equalsIgnoreCase("GG")) {
//            System.out.println("Grande");
//        }else {
//            System.out.println("Medida inválida!");
//        }

        //Modo condicional com switch case
        switch (sigla.toUpperCase()){
            case "P":{
            System.out.println("Pequeno");
            break;
            }
            case "M":{
                System.out.println("Médio");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            case "GG":{
                System.out.println("Giga Grande");
                break;
            }
            default:{
                System.out.println("Medida inválida");
            }

        }
    }
}
