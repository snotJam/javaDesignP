package lastAndDetailDesc.behavior.mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        //设置各个对象与中介者关联
        Power power = new Power(mediator);
        Cpu cpu = new Cpu(mediator);
        Screen screen = new Screen(mediator);

        mediator.setCpu(cpu);
        mediator.setPower(power);
        mediator.setScreen(screen);

        power.open();
    }

}
