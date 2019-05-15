package lastAndDetailDesc.structType.decorator;

public class Client {
    public static void main(String[] args) {
        Car car = new BaseCar();
        car.run();
        System.out.println("--------------");
        Car car1 = new FlyDecorator(car);
        System.out.println("car1的翅膀数量是" + ((FlyDecorator) car1).getWing());
        car1.run();
        System.out.println("--------------");
        Car car2 = new SwimDecorator(car);
        car2.run();
        System.out.println("--------------");
        Car car3 = new SwimDecorator(car1);
        car3.run();

    }
}
