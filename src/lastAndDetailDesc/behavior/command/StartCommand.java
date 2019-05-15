package lastAndDetailDesc.behavior.command;

public class StartCommand implements CommandInterface {
    StartModel startModel;

    public StartCommand(StartModel startModel) {
        this.startModel = startModel;
    }

    @Override
    public void execute() {
        startModel.start();
    }
}
