package lastAndDetailDesc.behavior.mediator;

public class Screen extends Colleague {
    public Screen(Mediator mediator) {
        super(mediator);
    }

    public void run() {
        mediator.change(this);
    }

    public void showScreenInfo() {
        System.out.println("这是一个戴尔的显示器");
    }
}
