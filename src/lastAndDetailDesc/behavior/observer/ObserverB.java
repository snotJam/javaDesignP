package lastAndDetailDesc.behavior.observer;

public class ObserverB implements MObserver {
    @Override
    public void update() {
        System.out.println("ObserverB update");
    }
}
