package build;

public class Test {
	public static void main(String[] args) {
		IBuild build = new BuildProduct1();
		Direct direct = new Direct(build);
		
		Product product = build.create();
		
		System.out.println(product.getFood().getName());
		System.out.println(product.getSecondFood().getName());
		System.out.println(product.getDrink().getName());
	}
}
