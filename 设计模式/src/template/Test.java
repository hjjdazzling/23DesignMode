package template;

public class Test {
	public static void main(String[] args) {
		int[] array = { 9, 8, 2, 3, 45};
		AbstractSort sort = new ConcreteSort();
		
		sort.sort(array);
		sort.dispaly(array);
	}
}
