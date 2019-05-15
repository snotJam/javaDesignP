package lastAndDetailDesc.structType.composite;

public abstract class Component {

    abstract void say();

    /**
     * 子节点可能实现，但是叶子节点可能不需要，但是为了统一操作，写在了基类里面
     */
    public void addChild(Component component) {
    }

    public void removeChild(Component component) {
    }

}
