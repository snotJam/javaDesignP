package lastAndDetailDesc.behavior.mediator;

/**
 * 中介者类
 */
public class Mediator {
    Cpu cpu;
    Power power;
    Screen screen;

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void setPower(Power power) {
        this.power = power;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void change(Colleague colleague) {
        if (colleague instanceof Power) {       //电源通知的中介者
            power.showPowerInfo();
            cpu.run();      //中介者通知其他
        }
        if (colleague instanceof Cpu) {
            cpu.showCpuInfo();
            screen.run();
        }
        if (colleague instanceof Screen) {
            screen.showScreenInfo();
        }
    }
}
