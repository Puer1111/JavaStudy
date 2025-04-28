package javaMiddle.class7.nested.nested.example1;

public class Network {
    public void sendMessage(String text){
        NetworkMessage networkMessage =  new NetworkMessage(text);
        networkMessage.print();
    }
}
