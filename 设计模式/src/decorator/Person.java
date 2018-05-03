package decorator;

public interface Person {
	void eat();
}

class OldPersonImpl implements Person {
	@Override
	public void eat() {
		System.out.println("³Ô·¹");
	}
}

class NewPersonImpl implements Person {
	private OldPersonImpl oldPerson;
	
	public NewPersonImpl(OldPersonImpl person) {
		this.oldPerson = person;
	}
	
	@Override
 	public void eat() {
		System.out.println("×ö·¹()");
		oldPerson.eat();
		System.out.println("´òÉ¨()");
	}
}