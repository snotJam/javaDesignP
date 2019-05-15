package lastAndDetailDesc.behavior.chain;

public class Client {
    public static void main(String[] args) {
        ConcreteHandler1 handler1 = new ConcreteHandler1();
        ConcreteHandler2 handler2 = new ConcreteHandler2();
        ConcreteHandler3 handler3 = new ConcreteHandler3();
        handler1.setHandler(handler2);
        handler2.setHandler(handler3);
        handler1.handleRequest("A");
        handler1.handleRequest("base64");
    }
}
