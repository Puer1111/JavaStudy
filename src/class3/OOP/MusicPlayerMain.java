package class3.OOP;

public class MusicPlayerMain {
    public static void main(String[] args) {
//      절차 지향 프로그래밍 식 프로그램 구현
        int volume = 0;
        boolean isOn = false;

//      음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어 시작 ");

//       볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨: "  + volume);
//       볼륨 감소
        volume--;
        System.out.println("음악 플레이어 볼륨:  "  + volume);
//       볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨: "  + volume);
//       음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if(isOn){
            System.out.println("음악 플레이어 상태: " + isOn) ;
        }
        else{
            System.out.println("음악 플레이어 상태 OFF");
        }
//       음악 플레이어 끄기
        isOn=false;
        System.out.println("음악 플레이어 종료");
    }
}
