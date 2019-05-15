package lastAndDetailDesc.creator.abstructFactory;

public class Client {
    public static void main(String[] args) {
        BaseFactory factory = new IntelFactory();
        factory.createCpu().run();
        factory.createBoard().run();

        BaseFactory factory1 = new AMDFactory();
        factory1.createCpu().run();
        factory1.createBoard().run();
    }
}
