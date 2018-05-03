package Observer;

import java.util.Vector;

public  class Subject {
	private Vector<Observer> vector = new Vector<Observer>();
	private String name;
	
	public Subject(String name) {
		this.name = name;
	}
	public void add(Observer ob) {
		vector.add(ob);
	}
	
	public void remove(Observer ob) {
		vector.remove(ob);
	}
	
	private void notifyAllObserver() {
		for(int i=0; i<vector.size(); i++) {
			vector.get(i).update(name);
		}
	}
	
	public void doSothing() {
		System.out.println("¸üÐÂÁË");
		notifyAllObserver();
	}
}
