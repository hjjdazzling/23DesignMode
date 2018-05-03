package factory;

public class Test {
	public static void main(String[] args) {
		FactoryCar factory = new FactoryBMW();
		Car bmw = factory.createCar();
	}
}
