package javaMiddle.class5.enumeration.enumerationReFact2;


public class DiscountService {

    public int disCount(Grade grade, int price){
        return price * grade.getDiscountPercent() / 100;
    }

    // 할인율 계산을 위해 grade 에서 값을 꺼내 쓰는데 객체지향 관점에서 외부에 값을 노출하는건 별로 좋지 않기에 Grade 스스로가 관리하는것이 캡슐화 원칙에 맞다.
    // ReFact3 에서 확인.
}
