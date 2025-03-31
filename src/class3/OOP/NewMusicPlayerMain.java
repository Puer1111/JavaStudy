package class3.OOP;

public class NewMusicPlayerMain {
    public static void main(String[] args) {
//      클래스에 기능을 다 담아서 객체 생성 후 객체의 메소드만 호출하면 된다.
//      클래스에 기능을 전부다 알 필요 없기에 캡슐화도 되어있다.
        NewMusicPlayer newMusicPlayer = new NewMusicPlayer();
        // 음악 on
        newMusicPlayer.on();
        // 볼륨 증가
        newMusicPlayer.up();
        //볼륨 감소
        newMusicPlayer.down();
        // 음악 off
        newMusicPlayer.off();
        // 현재 상태
        newMusicPlayer.status();
    }
}
