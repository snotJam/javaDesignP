package lastAndDetailDesc.behavior.command;

public class RestartCommand implements CommandInterface{

    RestartModel restartModel;

    public RestartCommand(RestartModel restartModel) {
        this.restartModel = restartModel;
    }

    @Override
    public void execute() {
        restartModel.restart();
    }
}
