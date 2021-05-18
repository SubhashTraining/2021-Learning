package RestAssured.Project1;

import java.io.Serializable;

public class Support implements Serializable{
	
	private String url;
	private String text;
	
	
	public String getUrl() {
		return url;
	}
	public String getText() {
		return text;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	

}
