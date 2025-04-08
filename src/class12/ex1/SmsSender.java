package class12.ex1;

public class SmsSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println( "send sms:" + message);
    }
}
