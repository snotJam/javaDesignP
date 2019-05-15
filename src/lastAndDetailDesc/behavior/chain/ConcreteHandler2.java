package lastAndDetailDesc.behavior.chain;

public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String str) {
        if (str.contains("base64")) {
            System.out.println("ConcreteHandler2 处理了此问题，进行base64加密");
        } else {
            handler.handleRequest(str);
        }
    }
}
