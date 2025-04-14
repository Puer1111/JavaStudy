package javaMiddle.class1.object.equals;


import java.util.Objects;

public class UserV2 {

    //UserV1 과 다르게 번호가 같으면 같게 만들것 이다.
    //equals 재정의

    private String id;

    public UserV2(String id) {
        this.id = id;
    }
//
//    @Override
//    public boolean equals(Object obj) {
//        UserV2 user = (UserV2) obj;
//        return id.equals(user.id);  // 앞의 Id 는 this.id 이고 user.Id 는 인수로 넘어온 Id 가 같은지 비교하는것.
//    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        UserV2 userV2 = (UserV2) object;
        return Objects.equals(id, userV2.id);
    }

    // 예시로 만든 equals 는 정말 기초의 기초적인 조건으로 동등을 표현하기 떄문에 버그가 많다.
    // equals 에는 여러 규칙들이 있다.
}
