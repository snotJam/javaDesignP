package lastAndDetailDesc.behavior.state;

public class Client {
    public static void main(String[] args) {
        User user = new User();
        user.setStateInterface(new Regist());
        user.requestService();
        System.out.println("-----------------------------");
        user.setStateInterface(new UnLogin());
        user.requestService();
    }
}
