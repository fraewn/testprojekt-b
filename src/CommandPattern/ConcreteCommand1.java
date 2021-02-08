package CommandPattern;

public class ConcreteCommand1 implements CommandInterface {
	private CommandReceiver receiver;
	public ConcreteCommand1(CommandReceiver receiver){
		this.receiver = receiver;
	}

	// fault: receiver is never used in command
	@Override
	public void execute() {
		System.out.println("I am ConcreteCommand1 and start the receiver");
	}
}
