package javaMiddle.class7.nested.nested.example1;

public class NetworkMain {
    public static void main(String[] args) {
        Network network = new Network();      //NetWork 에서 NetworkMessage의 기능을 가지고 오기 위해 클래스 안에서 인스턴스 생성후 NetworkMeesage의 기능을 쓴다.
        network.sendMessage("hello");

        // example1 처럼 하면 패키지를 열었을 때 둘다 써야 하나 전달해서 써야하는건가 Or netWorkMeesage가 여러군데에서 쓰이는 구나 라고 생각할 수 있다.
    }
}
