package lastAndDetailDesc.behavior.command;

public class Invoker {
    StartCommand startCommand;
    RestartCommand restartCommand;

    public void setStartCommand(StartCommand startCommand) {
        this.startCommand = startCommand;
    }

    public void setRestartCommand(RestartCommand restartCommand) {
        this.restartCommand = restartCommand;
    }

    public void exeStart() {
        startCommand.execute();
    }

    public void exeRestart() {
        restartCommand.execute();
    }
}
