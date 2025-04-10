package javaBasic.OOP;

public class NewMusicPlayer {
    int volume;
    boolean isOn;

    void up(){
        volume++;
        System.out.println("volume= "+volume);
    }
    void down(){
        volume--;
        System.out.println("volume= "+volume);
    }
    void on(){
        isOn=true;
        System.out.println("MusicPlayer is on");
    }
    void off(){
        isOn=false;
        System.out.println("MusicPlayer is off");
    }
    void status(){
        System.out.println("Check Status: " + isOn);
        if(isOn){
            System.out.println("Playing");
        }
        else{
            System.out.println("Paused");
        }
    }
}
