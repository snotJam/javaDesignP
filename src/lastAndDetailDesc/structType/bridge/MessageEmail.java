package lastAndDetailDesc.structType.bridge;

public class MessageEmail implements MessageImp {
    @Override
    public void send() {
        System.out.println("Email消息发送");
    }
}
