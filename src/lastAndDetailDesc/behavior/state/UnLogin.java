package lastAndDetailDesc.behavior.state;

public class UnLogin implements StateInterface {
    @Override
    public void operation() {
        System.out.println("请先登录");
    }
}
