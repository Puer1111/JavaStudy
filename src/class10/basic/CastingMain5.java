package class10.basic;

public class CastingMain5 {
    public static void main(String[] args) {
    // instanceOf 인스턴스가 어떤 타입을 참고 하고 있는지 확인

        Parent parent1 = new Parent();
        System.out.println("Parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("Parent2 호출");
        call(parent2);
    }
    private static void call(Parent parent){
        parent.parentMethod();
        // 매개변수 parent 가 Parent로 부터 생성된 인스턴스 인지 child 로 부터 생성된 것인지 모름.
        if(parent instanceof Child){
            // instanceof 오른쪽에 있는 타입이 왼쪽에 있는 인스턴스 타입에 들어갈수 있느냐 물어보는것과 같음.
            // parent1 은 부모타입이라 False parent2 는 자식 타입이라 True.
            // Child c = new Parent(); 불가능 , Child c = new Child(); 가능
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }else{
            System.out.println("Child 인스턴스 아님.");
        }
    }


    //Java 16 부터 변수 생성과 동시에 instanceof 사용 가능.
    // 18라인 수정 하면 parent instanceof Child를 parentinstanceof Child child로 생성할 수 있다.
    // 하단에 다운 캐스팅도 생략.

//    private static void call(Parent parent){
//        parent.parentMethod();
//        // 매개변수 parent 가 Parent로 부터 생성된 인스턴스 인지 child 로 부터 생성된 것인지 모름.
//        if(parent instanceof Child child){
//            System.out.println("Child 인스턴스 맞음");
//            child.childMethod();
//        }else{
//            System.out.println("Child 인스턴스 아님.");
//        }
//    }
}
