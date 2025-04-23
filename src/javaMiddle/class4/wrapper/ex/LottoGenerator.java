package javaMiddle.class4.wrapper.ex;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private static int count;

    public int[] getLottoNumbers() {
        lottoNumbers = new int[6];
        count = 0;

        while(count<6){
            // 1 ~ 45 숫자 생성
            int number = random.nextInt(45)+1;
            // 중복 제거
            if(isUnique(number)){
                lottoNumbers[count] = number;
                count++;
            }
        }
        return lottoNumbers;
    }

    private boolean isUnique(int number){
        for(int i=0; i<count; i++){
            if(lottoNumbers[i]==number){
                return false;
            }
        }
        return true;
    }

    public int getCount() {
        return count;
    }

}
