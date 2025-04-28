package javaMiddle.class6.timeAndDate;

import java.time.ZoneId;

public class ZoneIdMain {
    public static void main(String[] args) {
        for(String a : ZoneId.getAvailableZoneIds()){
            System.out.println("availableZoneIds : " + a);
            ZoneId zoneId = ZoneId.of(a);
            System.out.println(zoneId + " | "+ zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zondId.systemDefault = " + zoneId);

        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId = " + seoulZoneId);


    }
}
