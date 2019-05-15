package lastAndDetailDesc.structType.decorator;

public class FlyDecorator extends BaseDecorator {
    private int wing = 2;

    public FlyDecorator(Car car) {
        super(car);
    }

    /**
     * 新的成员属性
     *
     * @return
     */
    public int getWing() {
        return wing;
    }

    public void setWing(int wing) {
        this.wing = wing;
    }

    /**
     * 被装饰者基础上扩展
     */
    @Override
    void run() {
        super.operation();
        System.out.println("this car can fly");
    }
}
