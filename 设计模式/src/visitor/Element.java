package visitor;

public abstract class Element {
	public abstract void accept(Visitor vistor);
	
	public abstract void dothing();
}

class ConcreteElement1 extends Element {
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public void dothing() {
		System.out.println("hello 这是元素1");
	}
}

class ConcreteElement2 extends Element {
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public void dothing() {
		System.out.println("hello 这是元素2");
	}
}
