package lastAndDetailDesc.behavior.templateMethod;

public class Client {
    public static void main(String[] args) {
        Login login = new NormalUserLogin("张三");
        login.doLogin();
        Login login1 = new VipLogin("李四");
        login1.doLogin();
    }
}
