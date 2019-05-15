package lastAndDetailDesc.behavior.command;

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.setStartCommand(new StartCommand(new StartModel()));
        invoker.setRestartCommand(new RestartCommand(new RestartModel()));
        invoker.exeStart();
        invoker.exeRestart();
    }
}
