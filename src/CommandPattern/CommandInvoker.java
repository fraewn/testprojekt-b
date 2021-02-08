package CommandPattern;

public class CommandInvoker {
	private CommandInterface command;

	// fault: dependencies on command receiver and a concrete command
	private CommandReceiver receiver;
	private ConcreteCommand1 command1;

	public void setCommand(CommandInterface command){
		this.command = command;
	}
	public void useCommand(){
		// fault: only command should be executed, not command1
		receiver = new CommandReceiver();
		command1 = new ConcreteCommand1(receiver);
		command1.execute();
	}
}
