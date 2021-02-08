package ProxyPattern;

public class Proxy implements ProxyInterface {
	private static ObjectHiddenByProxy hiddenObject;
	@Override
	public void execute() {
		if(hiddenObject == null){
			System.out.println("Info from Proxy: ObjectHiddenByProxy is being initialised");
			hiddenObject = new ObjectHiddenByProxy();
		}
		System.out.println("Info from Proxy: ObjectHiddenByProxy's method is executed");
		hiddenObject.execute();
	}
}
