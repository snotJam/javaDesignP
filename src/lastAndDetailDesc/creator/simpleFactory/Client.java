package lastAndDetailDesc.creator.simpleFactory;

public class Client {
    public static void main(String[] args) {
        Factory.creatInstance(1).run();
        Factory.creatInstance(2).run();
    }
}
