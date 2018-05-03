package visitor;

public class Test {
	public static void main(String[] args) {
		Visitor v1 = new VisitorImpl();
		ConcreteElement1 e1 = new ConcreteElement1();
		v1.visit(e1);
		
		ConcreteElement2 e2 = new ConcreteElement2();
		v1.visit(e2);
	}
}
