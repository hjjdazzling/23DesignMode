package bridge;

public class Test {
	public static void main(String[] args) {
		Implementor implementor = new ConcreteImplementorA();
        RefinedAbstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();
        abstraction.otherOperation();
	}
}
