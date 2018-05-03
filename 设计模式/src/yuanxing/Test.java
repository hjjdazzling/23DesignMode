package yuanxing;

public class Test {
	public static void main(String[] args) {
		Address address = new Address();
		address.setStreet("Áú³Ø");
		address.setNumber("10");
		
		Person person = new Person();
		person.setName("haojunjie");
		person.setSex("ÄĞ");
		person.setAddress(address);
		
		Person person2 = (Person) person.clone();
		
		System.out.println(person == person2);
		person.setName("ºÂ¿¡½Ü");
		System.out.println(person.getName());
		System.out.println(person2.getName());
		
		System.out.println(person.getAddress().getStreet());
		System.out.println(person2.getAddress().getStreet());
		
		person.getAddress().setStreet("ÁúÑô");
		System.out.println(person.getAddress().getStreet());
		System.out.println(person2.getAddress().getStreet());
	}
}
