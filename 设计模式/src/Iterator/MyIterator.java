package Iterator;

import java.util.ArrayList;

public interface MyIterator {
	boolean hasNext();
	Object next();
}

class MyListIterator implements MyIterator {
	//сн╠Й
	private int couror = 0;
	private ArrayList list;
		
	public MyListIterator(ArrayList list) {
		this.list = list;
	}
	@Override
	public boolean hasNext() {
		if(couror == list.size()) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		 Object obj = null;  
         if(this.hasNext()){  
             obj = this.list.get(couror++);  
         }  
         return obj;  
	}
	
}