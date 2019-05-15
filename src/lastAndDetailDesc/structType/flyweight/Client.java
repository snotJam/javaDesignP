package lastAndDetailDesc.structType.flyweight;

public class Client {
    public static void main(String[] args){
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight flyweight = flyweightFactory.getFlyweight("A");
        flyweight.read("RED");
        System.out.println(flyweight.hashCode());

        Flyweight flyweight1 = flyweightFactory.getFlyweight("B");
        flyweight1.read("BLUE");
        System.out.println(flyweight1.hashCode());

        Flyweight flyweight2 = flyweightFactory.getFlyweight("A");
        flyweight2.read("BLUE");
        System.out.println(flyweight2.hashCode());

    }
}
