package lastAndDetailDesc.structType.proxy;

public class Proxy implements Subject {
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("这是一个代理对象的request");
        realSubject.request();
    }
}
