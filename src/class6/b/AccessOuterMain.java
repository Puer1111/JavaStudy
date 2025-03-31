package class6.b;

import class6.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData(); //a 패키지 import 확인
        //public
        data.publicField = 1 ;
        data.publicMethod();

        // default 패키지 달라서 불가능
//        data.defaultField = 2;
//        data.defaultMethod();

        // private 달라서 불가능
//        data.privateField = 3;
//        data.privateMethod();

        data.innerAccess();
    }
}
