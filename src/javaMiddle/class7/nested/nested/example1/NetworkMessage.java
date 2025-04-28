package javaMiddle.class7.nested.nested.example1;

public class NetworkMessage {
    private String content;

    public NetworkMessage(String content) {
        this.content = content;
    }

    public void print(){
        System.out.println("content : " + content);
    }
}
