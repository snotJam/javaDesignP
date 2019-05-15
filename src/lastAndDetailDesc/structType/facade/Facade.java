package lastAndDetailDesc.structType.facade;

public class Facade {

    public static void run() {
        new ModuleA().run();
        new ModuleB().run();
        new ModuleC().run();
    }

    public void callArun() {
        new ModuleA().run();
    }

    public void callBrun() {
        new ModuleB().run();
    }

    public void callCrun() {
        new ModuleC().run();
    }
}
