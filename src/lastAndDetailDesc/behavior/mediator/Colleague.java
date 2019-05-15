package lastAndDetailDesc.behavior.mediator;

/**
 * 同事类基类，持有中介者对象
 */
public abstract class Colleague {
    Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }
}
