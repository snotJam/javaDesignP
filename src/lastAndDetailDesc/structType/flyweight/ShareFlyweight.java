package lastAndDetailDesc.structType.flyweight;

/**
 * 共享享元+外部状态
 * 按照惯性，我们认为，属性是固定的，一般会写成静态的，多个对象持有同一个属性。但是创建的时候还是多个对象
 *      注意这里的共享享元不是静态的，也就是说不是一开始就声明好的，比如内部状态insideState并不是一开始就是静态的，
 * 而是在创建的时候，如果传入的insideState是一样的，那么就是同一个享元对象,以此种方式+factory来复用对象。解决多个细粒度对象的问题
 *
 * 这个模式针对的是对象的复用
 *
 */
public class ShareFlyweight implements Flyweight {

    private String insideState;     //内部状态，不提供set方法

    public ShareFlyweight(String insideState) {
        this.insideState = insideState;
    }

    @Override
    public void read(String extrinsicState) {
        System.out.println("insideState是" + insideState);
        System.out.println("extrinsicState是" + extrinsicState);
    }
}
