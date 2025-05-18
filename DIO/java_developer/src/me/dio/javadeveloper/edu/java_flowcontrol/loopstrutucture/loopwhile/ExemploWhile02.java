package me.dio.javadeveloper.edu.java_flowcontrol.loopstrutucture.loopwhile;

import java.util.Scanner;

public class ExemploWhile02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";

        while(!name.equalsIgnoreCase("exit")){
            System.out.print("\nInforme o primeiro nome da pessoa: ");
            name = sc.next();
            System.out.println(name);
        }
    }
}
