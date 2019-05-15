package lastAndDetailDesc.behavior.iterator;

/**
 * 聚合对象主要作用是维护一个数组，提供一个长度，一个获取index位置的元素的方法
 */
public class ConcreteAggregate extends Aggregate {
    private String[] args = null;

    @Override
    IteratorInterface createIterator() {
        return new ConcreteIterator(this);
    }

    public ConcreteAggregate(String[] args) {
        this.args = args;
    }

    public Object get(int index) {
        Object retObj = null;
        if (index < args.length) {
            retObj = args[index];
        }
        return retObj;
    }

    public int size() {
        return this.args.length;
    }
}
