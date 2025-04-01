package class9.access.child;

import class9.access.parent.Parent;

public class Child extends Parent {
    public void call(){
        publicValue =1;   // 부모에 있는 publicValue를 0에서 1로 올림
        protectedValue = 2; // ** 2로 올림.
        //defaultValue = 1;
        //privateValue = 2;

        publicMethod();
        protectedMethod();

        printParent();
        // 접근 제어자 Protected 는 같은패키지 OR 상속 관게 허용 가능이기에 호출 가능.
    }
}
