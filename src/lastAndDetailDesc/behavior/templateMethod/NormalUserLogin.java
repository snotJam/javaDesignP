package lastAndDetailDesc.behavior.templateMethod;

public class NormalUserLogin extends Login {

    public NormalUserLogin(String userName) {
        super(userName);
    }

    @Override
    protected void doLogin() {
        System.out.println("普通用户登录");
    }
}
