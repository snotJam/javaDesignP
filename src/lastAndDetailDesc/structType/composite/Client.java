package lastAndDetailDesc.structType.composite;

public class Client {
    public static void main(String[] args){
        Component component = new Composite();
        Component leaf1 = new Leaf("A");
        Component leaf2 = new Leaf("B");
        Component leaf3 = new Leaf("C");
        component.addChild(leaf1);
        component.addChild(leaf2);
        component.addChild(leaf3);
        component.say();
        leaf1.say();
        leaf2.say();
        leaf3.say();
    }
}
