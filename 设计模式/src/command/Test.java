package command;

public class Test {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		//客户端直接调用
		command.execute();
		//调用者调用
		Invoker invoker = new Invoker(command);
		invoker.action();
	}
}
