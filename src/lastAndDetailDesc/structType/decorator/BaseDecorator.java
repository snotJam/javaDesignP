package lastAndDetailDesc.structType.decorator;

/**
 * 装饰者基类，
 */
public abstract class BaseDecorator extends Car {
    Car car;

    public BaseDecorator(Car car) {
        this.car = car;
    }

    public void operation() {
        car.run();
    }
}
