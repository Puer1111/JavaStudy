package javaBasic.class6;

public class Speaker {
    private int volume;

    Speaker(int volume){
        this.volume = volume;
    }
    void volumeUp(){
        if(volume >= 100){
            System.out.println("Volume can't higher than 100");
        }
        else{
            volume +=10;
            System.out.println("볼륨을 10 증가합니다.");
        }
    }
    void volumeDown(){
        if(volume < 0){
            System.out.println("Volume can't lower than 0");
        }
        else{
            volume -=10;
            System.out.println("볼륨을 10 감소합니다.");
        }
    }
    void ShowVolume(){
        System.out.println("현재 볼륨: " + volume);
    }


}
