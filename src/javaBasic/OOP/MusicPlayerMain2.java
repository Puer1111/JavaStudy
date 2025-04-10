package javaBasic.OOP;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
//      음악 객체에 기능을 묶어서 구현. 아직 절차 지향.
//      메소드 추출 까지.
//      절차의 한계 - 기능과 데이터가 분리되어 있어서 유지보수 힘듬. 데이터 변경 시 기능도 변경 해야하는데 불편함.
        MusicPlayerData data = new MusicPlayerData();
//      음악 플레이어 켜기
        on(data);
//      볼륨 증가
        volumeUp(data);
//      볼륨 감소
        volumeDown(data);
//      음악 플레이어 상태
        showStatus(data);
//      음악 플레이어 끄기
        off(data);
    }

    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("현재 볼륨: " + data.volume);
    }
    static void volumeDown(MusicPlayerData data){
        data.volume++;
        System.out.println("현재 볼륨: " + data.volume);
    }
    static void showStatus(MusicPlayerData data){
        if(data.isOn){
            System.out.println("현재 상태: " + data.isOn);
        }
        else{
            System.out.println("꺼져있습니다.");
        }
    }
}
