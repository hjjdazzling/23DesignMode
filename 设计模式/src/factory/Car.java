package factory;

public abstract class Car {
}

class BMW extends Car {
	public BMW() {
		System.out.println("创建一个宝马");
	}
}

class DaZhong extends Car {
	public DaZhong() {
		System.out.println("创建一个大众");
	}
}