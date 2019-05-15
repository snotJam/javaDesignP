package lastAndDetailDesc.behavior.mediator;

public class Cpu extends Colleague {
    public Cpu(Mediator mediator) {
        super(mediator);
    }

    public void run() {
        mediator.change(this);
    }

    public void showCpuInfo() {
        System.out.println("这是一个intel的CPU");
    }
}
