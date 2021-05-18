package RestAssured.Project1;

import java.io.Serializable;

public class Book implements Serializable{
	
	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	private Data[] data;
	private Support support;
	
	
	
	public int getPage() {
		return page;
	}
	public int getPer_page() {
		return per_page;
	}
	public int getTotal() {
		return total;
	}
	public int getTotal_pages() {
		return total_pages;
	}
	public Data[] getData() {
		return data;
	}
	public Support getSupport() {
		return support;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}
	public void setData(Data[] data) {
		this.data = data;
	}
	public void setSupport(Support support) {
		this.support = support;
	}
	
	
	@Override
	public final String toString()
	{
		
		StringBuffer sb = new StringBuffer("\nBook:\n{");
		sb.append("\ndata:\n[\n");
		for(Data data:this.data)
		{
			sb.append("\n{");
			sb.append("id: "+data.getId()+",");
			sb.append("email: "+data.getEmail()+",");
			sb.append("first_name: "+data.getFirst_name()+",");
			sb.append("last_name: "+data.getLast_name()+",");
			sb.append("avatar: "+data.getAvatar());
			sb.append("\n},");
			
		}
		sb.append("\n]");
		
		
		return new String(sb.toString());
		
	}
	
	
}
