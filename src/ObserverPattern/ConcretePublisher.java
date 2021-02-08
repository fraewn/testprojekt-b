package ObserverPattern;

public class ConcretePublisher extends Publisher {
    private Object state;
    public Object getState (){
        return state;
    }
    public void setState (Object s){
        state = s;
    }
}
