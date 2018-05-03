package decorator;

public class Test {
	public static void main(String[] args) {
		OldPersonImpl oldPerson = new OldPersonImpl();
		Person person = new NewPersonImpl(oldPerson);
		person.eat();
	}
}
