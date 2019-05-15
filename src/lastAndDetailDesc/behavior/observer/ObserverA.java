package lastAndDetailDesc.behavior.observer;

public class ObserverA implements MObserver{
    @Override
    public void update() {
        System.out.println("ObserverA update");
    }
}
