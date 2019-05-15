package lastAndDetailDesc.structType.decorator;

public class SwimDecorator extends BaseDecorator {
    public SwimDecorator(Car car) {
        super(car);
    }

    @Override
    void run() {
        super.operation();
        System.out.println("this car can swim");
    }
}
