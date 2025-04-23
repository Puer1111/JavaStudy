package javaMiddle.class4.wrapper.ex;

import java.util.Arrays;

public class LottoTest {
    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();
        int[] answer = lottoGenerator.getLottoNumbers();
        for(int lottoNumber:answer){
            System.out.print(lottoNumber+" ");
        }
    }
}
