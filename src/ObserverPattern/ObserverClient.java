package ObserverPattern;

public class ObserverClient {
    public void executeObserverExample() {
        ConcreteSubscriber con = new ConcreteSubscriber();
        con.update();
    }
}
