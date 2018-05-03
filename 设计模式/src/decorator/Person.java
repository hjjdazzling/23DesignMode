package decorator;

public interface Person {
	void eat();
}

class OldPersonImpl implements Person {
	@Override
	public void eat() {
		System.out.println("�Է�");
	}
}

class NewPersonImpl implements Person {
	private OldPersonImpl oldPerson;
	
	public NewPersonImpl(OldPersonImpl person) {
		this.oldPerson = person;
	}
	
	@Override
 	public void eat() {
		System.out.println("����()");
		oldPerson.eat();
		System.out.println("��ɨ()");
	}
}