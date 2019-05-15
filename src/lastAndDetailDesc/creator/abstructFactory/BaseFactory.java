package lastAndDetailDesc.creator.abstructFactory;

public interface BaseFactory {
    Cpu createCpu();    //用户要通过工厂拿到对象，必须有返回类型

    Board createBoard();
}
