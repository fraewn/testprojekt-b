import CommandPattern.CommandClient;
import ObserverPattern.ObserverClient;
import ProxyPattern.ProxyClient;
import Singleton.MilkyWay;
import strategy.StrategyClient;

public class main {

	public static void main(String args[]){
		StrategyClient strategyClient = new StrategyClient();
		strategyClient.beAClient();

		System.out.println("-------------------------------");

		ProxyClient proxyClient = new ProxyClient();
		proxyClient.executeProxyExample();

		System.out.println("-------------------------------");

		ObserverClient observerClient = new ObserverClient();
		observerClient.executeObserverExample();

		System.out.println("-------------------------------");

		CommandClient commandClient = new CommandClient();
		commandClient.executeCommandExample();

		System.out.println("-------------------------------");

		MilkyWay milkyWay = new MilkyWay();
		milkyWay.milkyWayNews();


	}
}
