package lastAndDetailDesc.behavior.templateMethod;

public abstract class Login {
    private String userName;

    public Login(String userName) {
        this.userName = userName;
    }

    protected abstract void doLogin();
}
