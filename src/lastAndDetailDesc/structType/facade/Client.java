package lastAndDetailDesc.structType.facade;

public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.callArun();      //这种有其实感觉可以直接调用模块而不通过外观类
        facade.callBrun();
        facade.callCrun();
        System.out.println("--------分割线---------");
        Facade.run();
    }
}
