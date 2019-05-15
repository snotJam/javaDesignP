package lastAndDetailDesc.structType.bridge;

public class MessageMSM implements MessageImp {
    @Override
    public void send() {
        System.out.println("短消息发送");
    }
}
