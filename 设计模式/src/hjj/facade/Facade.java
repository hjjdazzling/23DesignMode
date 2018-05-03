package hjj.facade;

public class Facade {
	public void method() {
		SubClass1 c1 = new SubClass1();
		SubClass2 c2 = new SubClass2();
		SubClass3 c3 = new SubClass3();
		
		c1.method1();
		c1.method2();
		c2.method1();
		c2.method2();
		c3.method1();
		c3.method2();
	}
}

class SubClass1 {
	public void method1() {
		System.out.println("subClass1 method1");
	}
	
	public void method2() {
		System.out.println("subClass1 method2");
	}
}

class SubClass2 {
	public void method1() {
		System.out.println("subClass2 method1");
	}
	
	public void method2() {
		System.out.println("subClass2 method2");
	}
}

class SubClass3 {
	public void method1() {
		System.out.println("subClass3 method1");
	}
	
	public void method2() {
		System.out.println("subClass3 method2");
	}
}