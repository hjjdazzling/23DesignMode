package command;

public class Test {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		//�ͻ���ֱ�ӵ���
		command.execute();
		//�����ߵ���
		Invoker invoker = new Invoker(command);
		invoker.action();
	}
}
