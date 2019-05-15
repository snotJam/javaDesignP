package lastAndDetailDesc.structType.proxy;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("实际目标类执行request");
    }
}
