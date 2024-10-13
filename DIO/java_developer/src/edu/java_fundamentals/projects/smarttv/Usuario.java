package edu.java_fundamentals.projects.smarttv;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.downVolume();
        smartTv.downVolume();
        smartTv.downVolume();
        smartTv.upVolume();

        System.out.println("Canal atual: " + smartTv.channel);

        smartTv.changeChannel(22);

        System.out.println("Canal atual: " + smartTv.channel);

        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("A TV está ligada? " + smartTv.onOff);
        System.out.println("Canal atual: " + smartTv.channel);
        System.out.println("Volume atual: " + smartTv.volume);


        smartTv.on();
        System.out.println("A TV foi ligada corretamente? " + smartTv.onOff);

        smartTv.off();
        System.out.println("A TV foi ligada corretamente? " + smartTv.onOff);


    }
}
