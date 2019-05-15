package lastAndDetailDesc.behavior.iterator;

public class Client {
    public static void main(String[] args) {
        String[] names = {"张三", "李四", "王五", "赵六", "田七"};
        Aggregate aggregate = new ConcreteAggregate(names);
        IteratorInterface iterator = aggregate.createIterator();
        iterator.first();

        while (!iterator.isDone()) {
            Object o = iterator.currentItem();
            System.out.println("item is " + o);
            iterator.next();
        }
    }
}
