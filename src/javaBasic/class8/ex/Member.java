package javaBasic.class8.ex;

public class Member {
    private final String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public void changeData (String name) {
//        this.id = id;  // id 는 final 이라 변경 불가능.
        this.name = name;
    }
    public void print(){
        System.out.println("id: " + this.id + " name: " + this.name);
    }
}
