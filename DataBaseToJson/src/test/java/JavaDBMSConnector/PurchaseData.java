package JavaDBMSConnector;

public class PurchaseData {
	
	private String CourseName;
	private String PurchasedDate;
	private int Amount;
	private String Location;
	
	
	public String getCourseName() {
		return CourseName;
	}
	public String getPurchasedDate() {
		return PurchasedDate;
	}
	public int getAmount() {
		return Amount;
	}
	public String getLocation() {
		return Location;
	}
	
	
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public void setPurchasedDate(String purchasedDate) {
		PurchasedDate = purchasedDate;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public void setLocation(String location) {
		Location = location;
	}
	
	
	
	
	

}
