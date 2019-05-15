package lastAndDetailDesc.structType.bridge;

public class Client {
    public static void main(String[] args) {
        MessageImp messageImp = new MessageMSM();
        messageImp.send();

        UrgencyMessage message = new UrgencyMessage(messageImp);
        message.sendMessage();
        message.watch();
    }
}
