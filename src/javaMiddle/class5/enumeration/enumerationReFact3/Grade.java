package javaMiddle.class5.enumeration.enumerationReFact3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30) ,VIP(40);        // 자체 인스턴스 생략이기 때문에 그냥 괄호 열고 함.

    private final int discountPercent;

    Grade(int discountPercent) {       // private 생략.
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    // 계산 메소드 추가
    public int disCount(int price){
        return price * discountPercent / 100;
    }
}
