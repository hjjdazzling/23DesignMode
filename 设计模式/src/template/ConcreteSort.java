package template;

public class ConcreteSort extends AbstractSort {

	@Override
	public void dispaly(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
}
