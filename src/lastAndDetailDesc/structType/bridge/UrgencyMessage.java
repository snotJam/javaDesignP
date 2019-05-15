package lastAndDetailDesc.structType.bridge;

/**
 * 加急消息
 */
public class UrgencyMessage extends AbstructMessage {
    public UrgencyMessage(MessageImp imp) {
        super(imp);
    }

    @Override
    protected void sendMessage() {
        System.out.println("短消息加急");
        super.sendMessage();
    }

    public void watch() {
        System.out.println("加急消息特殊处理");
    }
}
