package javaMiddle.class2.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public ImmutableObj add(int addValue){
        int result = value + addValue;      // value 의 값이 바뀌면 안되기 때문에 이런 방식으로 생성.
        return new ImmutableObj(result);   // 더해서 새로운 객체에 담아서 반환한다.
    }

}
