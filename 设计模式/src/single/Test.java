package single;

public class Test {
	public static int i = 0;
	
	public static int test() {
		return i++;
	}
	public static void main(String[] args) {
		System.out.println(Test.test());
	}
}
