package class12.ex1;

public class EmailSender implements Sender{

    @Override
    public void sendMessage(String message) {
        System.out.println("send email:" + message);
    }
}
