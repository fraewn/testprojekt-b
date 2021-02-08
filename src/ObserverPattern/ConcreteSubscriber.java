package ObserverPattern;

public class ConcreteSubscriber implements Subscriber {
    @Override
    public void update() {
        ConcretePublisher concretePublisher = new ConcretePublisher();
        concretePublisher.getState();
    }
}
