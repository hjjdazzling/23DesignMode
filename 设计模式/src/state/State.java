package state;

public abstract class State {
	public abstract void behavior();
}

class ConcreteStateA extends State {

	@Override
	public void behavior() {
		// TODO Auto-generated method stub
		System.out.println("Ƿ����");
	}
	
}
class ConcreteStateB extends State {

	@Override
	public void behavior() {
		// TODO Auto-generated method stub
		System.out.println("����������");
	}
	
}
