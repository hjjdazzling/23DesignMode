package state;

public class Context {
	private State state;
	private double money;
	
	public Context(double money) {
		this.money = money;
	}
	
	public void handle() {
		check();
		state.behavior();
	}
	
	public void check() {
		if(money < 0) {
			state = new ConcreteStateA();
		} else {
			state = new ConcreteStateB();
		}
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
}
