package PracticeExercies.Numbers.JSON.JSON1;

public class Address {
	
	private String street;
	private String city;
	private int zipcode;
	
	
	
	public Address()
	{
		this.street= null;
		this.city=null;
		this.zipcode= 0;
	}
	
	public Address(String street, String city, int zipcode)
	{
		this.street= street;
		this.city=city;
		this.zipcode= zipcode;
	}
	
	
	
	public void setStreet(String street) {
		street = street;
	}
	
	
	@Override
	protected Address clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Address address= (Address) super.clone();
		address.city=this.city;
		address.zipcode=this.zipcode;
		address.street= this.street;
		return  address;
		
		
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public int getZipCode() {
		return zipcode;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public void setZipCode(int zipCode) {
		zipcode = zipCode;
	}
	

}
