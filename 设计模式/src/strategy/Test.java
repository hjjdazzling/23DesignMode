package strategy;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] array = { 9, 8, 2, 3, 45};
		Strategy strategy = new BubbleStrategy();
		Context context = new Context(strategy);
		context.sort(array);
		System.out.println(Arrays.toString(array));
	}
}
