package javaMiddle.class5.enumeration.enumerationReFact;

public class DiscountService {

    public int disCount(ClassGrade classgrade, int price){
        return price * classgrade.getDisCountPercent() / 100;        // classGrade 에 인스턴스 생성과 동시에 할인율을 넣기에 이를 Getter 통해 가져올 수 있음.
    }
}
