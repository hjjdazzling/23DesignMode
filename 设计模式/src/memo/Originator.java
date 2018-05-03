package memo;

import java.util.ArrayList;

public class Originator {
	private String state = "";

	public Memento createMemento() {
		return new Memento(state);
	}
	public void restoreMemento(Memento memento,int index) {
		this.setState(memento.getMemento(index));
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}

class Memento {
	private ArrayList<String> list = new ArrayList<>();
	
	public Memento(String state) {
		list.add(state);
	}
	
	public void addMemento(Originator o) {
		list.add(o.getState());
	}
	
	public String getMemento(int index) {
		return list.get(index);
	}
	
	public void  remove(int index) {
		list.remove(index);
	}
	
	public ArrayList<String> getAllState() {
		return list;
	}
}

class CareTaker {
	public Memento memento;
	
	public CareTaker(Memento memento) {
		this.memento = memento;
	}

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}