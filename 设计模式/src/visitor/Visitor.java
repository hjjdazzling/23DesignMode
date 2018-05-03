package visitor;

public interface Visitor {
	void visit(ConcreteElement1 c1);
	void visit(ConcreteElement2 c2);
}

class VisitorImpl implements Visitor {

	@Override
	public void visit(ConcreteElement1 c1) {
		c1.dothing();
	}

	@Override
	public void visit(ConcreteElement2 c2) {
		c2.dothing();
	}
	
}