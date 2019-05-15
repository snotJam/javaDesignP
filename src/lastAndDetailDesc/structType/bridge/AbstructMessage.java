package lastAndDetailDesc.structType.bridge;

/**
 * 扩展业务的消息类
 */
public abstract class AbstructMessage {
    MessageImp imp;

    public AbstructMessage(MessageImp imp) {
        this.imp = imp;
    }

    protected void sendMessage() {
        imp.send();
    }
}
