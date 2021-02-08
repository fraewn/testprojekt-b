package strategy;

public class StrategyClient {
	Strategy strategy1 = new ConcStrategy1();
	public void beAClient(){
		strategy1.execute();
	}
}
