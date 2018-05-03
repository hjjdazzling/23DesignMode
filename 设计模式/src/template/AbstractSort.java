package template;

import java.util.Arrays;

public abstract class AbstractSort {
	
	public abstract void dispaly(int[] array);
	
	public final void sort(int[] array) {
		
		for(int i=0; i<array.length; i++) {
			int min = i;
			
			for(int j=i+1; j<array.length; j++) {
				if(array[j] < array[min]) {
					min = j;
				}
			}
			
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
	}
	
	
}
