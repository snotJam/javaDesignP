package lastAndDetailDesc.structType.composite;

/**
 * 叶子节点
 */
public class Leaf extends Component {
    String name = "";

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    void say() {
        System.out.println("这是叶子节点" + name);
    }
}
