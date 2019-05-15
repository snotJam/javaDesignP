package lastAndDetailDesc.behavior.state;

public class User {
    StateInterface stateInterface;

    public void setStateInterface(StateInterface stateInterface) {
        this.stateInterface = stateInterface;
    }

    public void requestService() {
        stateInterface.operation();
    }
}
