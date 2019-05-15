package lastAndDetailDesc.structType.composite;

import java.util.ArrayList;

/**
 * 子节点，非叶子节点
 */
public class Composite extends Component {
    ArrayList<Component> list = new ArrayList<>();

    @Override
    void say() {
        System.out.println("这是子节点");
    }

    @Override
    public void addChild(Component component) {
        list.add(component);
    }

    @Override
    public void removeChild(Component component) {
        list.remove(component);
    }
}
