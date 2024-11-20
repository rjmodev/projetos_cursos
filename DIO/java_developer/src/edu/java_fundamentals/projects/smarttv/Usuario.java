package edu.java_fundamentals.projects.smarttv;
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();
        Scanner scan = new Scanner(System.in);

        //Informando que a tv foi ligada corretamente ou está desligada
        smartTv.on();
        System.out.println("A TV foi ligada corretamente? " + smartTv.onOff);

        smartTv.off();
        System.out.println("A TV foi ligada corretamente? " + smartTv.onOff);

        smartTv.on();
        System.out.println("A TV foi ligada corretamente? " + smartTv.onOff);

        //Alterando as configurações iniciais da TV
        smartTv.downVolume();
        smartTv.downVolume();
        smartTv.downVolume();
        smartTv.upVolume();

        //Alterando o canal da tv digitando o canal

        System.out.println("Digite o canal que deseja assistir: " );

        smartTv.changeChannel(scan.nextInt());

        System.out.println("O canal foi alterado para: " + smartTv.channel);

        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("A TV está ligada? " + smartTv.onOff);
        System.out.println("Canal atual: " + smartTv.channel);
        System.out.println("Volume atual: " + smartTv.volume);
    }
}
