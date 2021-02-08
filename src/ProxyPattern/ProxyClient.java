package ProxyPattern;

public class ProxyClient {
	public void executeProxyExample(){
		// forbidden: Client directly accessed the hidden object
		ProxyInterface proxy = new ObjectHiddenByProxy();
		proxy.execute();
	}

}
