package memo;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		Originator o1 = new Originator();
		o1.setState("hello");

		Memento memento = o1.createMemento();
		CareTaker taker = new CareTaker(memento);
		
		o1.setState("world");
		memento.addMemento(o1);
		o1.setState("hjj");
		memento.addMemento(o1);
		o1.setState("haojunjie");
		memento.addMemento(o1);
		
		ArrayList<String> list = memento.getAllState();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//»Ö¸´µ½³õÊ¼×´Ì¬
		o1.restoreMemento(memento, 0);
		System.out.println("»Ö¸´³õÊ¼×´Ì¬:" + o1.getState());
	}
}
