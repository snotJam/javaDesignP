package lastAndDetailDesc.behavior.observer;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject();
        ObserverA observerA = new ObserverA();
        ObserverB observerB = new ObserverB();
        ObserverC observerC = new ObserverC();
        subject.attach(observerA);
        subject.attach(observerB);
        subject.attach(observerC);
        subject.change();
        System.out.println("-----------------------------");
        subject.detach(observerB);
        subject.change();
    }
}
