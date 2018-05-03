package state;

public abstract class State {
	public abstract void behavior();
}

class ConcreteStateA extends State {

	@Override
	public void behavior() {
		// TODO Auto-generated method stub
		System.out.println("欠费中");
	}
	
}
class ConcreteStateB extends State {

	@Override
	public void behavior() {
		// TODO Auto-generated method stub
		System.out.println("话费余额充足");
	}
	
}
