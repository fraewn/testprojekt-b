package strategy;

public class ConcStrategy1 implements Strategy {
	@Override
	public void execute() {
		System.out.println("Hello from Strategy 1");
	}
}
