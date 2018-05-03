package yuanxing;

public class Address implements Cloneable{
	private String street;
	private String number;
	
	@Override
	public Object clone() {
		Address address = null;
		
		try {
			address = (Address)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return address;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
}
