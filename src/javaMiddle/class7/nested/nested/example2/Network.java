package javaMiddle.class7.nested.nested.example2;

public class Network {
    public void sendMessage(String text){
        NetworkMessage networkMessage =  new NetworkMessage(text);
        networkMessage.print();
    }

    private class NetworkMessage {
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println("content : " + content);
        }
    }
}
// Network 안에 NetworkMessage 넣어서 외부 노출 및 사용 안함 나타냄.
