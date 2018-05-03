package adaptor;

public class Adaptee {
	public void reqeust() {
		System.out.println("ÇëÇó·şÎñ");
	}
}
interface Target {
	void request();
}

class Adaptor implements Target {
	private Adaptee adaptee;
	
	public Adaptor(Adaptee adaptee) {
		this.adaptee = adaptee;
	}
	@Override
	public void request() {
		adaptee.reqeust();
	}
	
}