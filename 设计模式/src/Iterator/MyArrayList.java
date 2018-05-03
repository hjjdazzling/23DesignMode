package Iterator;

import java.util.ArrayList;

public class MyArrayList implements Aggregate {
	private ArrayList list = new ArrayList();

	@Override
	public void add(Object object) {
		list.add(object);
	}

	@Override
	public void remove(Object obj) {
		list.remove(obj);
	}

	@Override
	public MyIterator iterator() {
		return new MyListIterator(list);
	}
	
	
}
