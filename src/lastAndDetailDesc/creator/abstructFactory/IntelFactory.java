package lastAndDetailDesc.creator.abstructFactory;

public class IntelFactory implements BaseFactory {

    @Override
    public Cpu createCpu() {
        return new IntelCpu();
    }

    @Override
    public Board createBoard() {
        return new JiJiaBoard();
    }
}
