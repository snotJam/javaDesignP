package lastAndDetailDesc.creator.abstructFactory;

public class AMDFactory implements BaseFactory {
    @Override
    public Cpu createCpu() {
        return new AmdCpu();
    }

    @Override
    public Board createBoard() {
        return new HuShuBoard();
    }
}
