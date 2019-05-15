package lastAndDetailDesc.behavior.templateMethod;

public class VipLogin extends Login {
    public VipLogin(String userName) {
        super(userName);
    }

    @Override
    protected void doLogin() {
        System.out.println("VIP 用户登录");
    }
}
