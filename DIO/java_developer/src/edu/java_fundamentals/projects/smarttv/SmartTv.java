package edu.java_fundamentals.projects.smarttv;

public class SmartTv {
    boolean onOff = false;
    int channel = 1;
    int volume = 15;

    //Aumentar ou diminuir volume
    public void upVolume () {
        //volume = volume + 1
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }
    public void downVolume () {
        //volume = volume - 1
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }

    //SmartTV Ligada Ou Desligada
    public void on (){
        onOff = true;
    }
    public void off (){
        onOff = false;
    }

    //Channel acima, abaixo ou definido
    public void changeChannel (int newChanel) {
        channel = newChanel;
    }
    public void upChannel () {
        channel++;
    }
    public void downChannel () {
        channel--;
    }
}
