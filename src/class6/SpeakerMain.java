package class6;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.ShowVolume();

        speaker.volumeUp();
        speaker.ShowVolume();

        speaker.volumeUp();
        speaker.ShowVolume();

        speaker.volumeDown();
        speaker.ShowVolume();

        //소리100 제한된 스피커를 필드에 직접 접근해서 소리를 바꾼다.
        System.out.println("volume field access");
//        speaker.volume = 200; 본래 직접 음량을 바꿀 수 있었으나 volume을 private 으로 바꿔버리면 조정할 수 없다.
        speaker.ShowVolume();
        // 이러면 이제 스피커가 망가지는 거다. 접근제어자의 중요성.
    }
}
