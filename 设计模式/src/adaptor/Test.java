package adaptor;

public class Test {
	public static void main(String[] args) {
		Target target = new Adaptor(new Adaptee());
		target.request();
	}
}
