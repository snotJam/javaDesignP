package lastAndDetailDesc.structType.flyweight;

/**
 *非共享享元对象？
 */
public class UnshareFlywieght implements Flyweight {
    private String allState;

    @Override
    public void read(String extrinsicState) {
        System.out.println("allState是" + allState);
        System.out.println("extrinsicState是" + extrinsicState);
    }
}
