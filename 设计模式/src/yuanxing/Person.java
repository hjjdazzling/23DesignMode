package yuanxing;

public class Person implements Cloneable{
	private String name;
	private String sex;
	private Address address;
	
	@Override
	public Object clone() {
		Person person = null;
		
		try {
			person = (Person)super.clone();
			person.address = (Address)address.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return person;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
