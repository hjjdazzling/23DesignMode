package Observer;

public class Observer {
	private String name;
	
	public Observer(String name) {
		this.name = name;
	}
	public void update(String name) {
		System.out.println(this.name + "���۲���" + name + "������");
	}
}
