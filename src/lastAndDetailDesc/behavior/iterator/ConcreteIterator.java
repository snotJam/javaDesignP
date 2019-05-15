package lastAndDetailDesc.behavior.iterator;

/**
 * 迭代器构造函数关联聚合对象
 * 迭代器主要操作的是索引
 * 获取当前索引对象还是通过调用聚合对象方法实现
 */
public class ConcreteIterator implements IteratorInterface {
    private int index = -1;     //索引
    ConcreteAggregate aggregate;    //持有的聚合对象

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if (index < this.aggregate.size()) {
            index = index + 1;
        }
    }

    @Override
    public boolean isDone() {
        if (index == this.aggregate.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object currentItem() {
        return this.aggregate.get(index);
    }
}
