package lastAndDetailDesc.behavior.mediator;

public class Power extends Colleague {
    public Power(Mediator mediator) {
        super(mediator);
    }

    //运行的时候通知中介者
    public void open() {
        mediator.change(this);
    }

    public void showPowerInfo(){
        System.out.println("这是一个长城的电源");
    }
}
