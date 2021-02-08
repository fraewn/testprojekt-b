package ProxyPattern;

public class ObjectHiddenByProxy implements ProxyInterface {

	@Override
	public void execute() {
		System.out.println("Hello from object hidden by proxy");
	}
}
