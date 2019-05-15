package lastAndDetailDesc.behavior.state;

public class UnRegist implements StateInterface {
    @Override
    public void operation() {
        System.out.println("请先注册");
    }
}
