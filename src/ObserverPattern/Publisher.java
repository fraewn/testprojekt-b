package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {
    private List<Subscriber> subscribers = new ArrayList<Subscriber>();
    public void subscribe (Subscriber s){
        subscribers.add(s);
    }
    public void unsubscribe (Subscriber s){
        subscribers.remove(s);
    }
}
