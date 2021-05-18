package RestAssured.Project2;


import java.io.File;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/*
 	The baseURI read-only property returns the absolute base URL of a Node . 
 	The base URL is used to resolve relative URLs when the browser needs to obtain an absolute URL
 */

public class Post {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Example for Post Request
		String sep = File.separator;
		String FilePath ="C:"+sep+"Users"+sep+"778294"+sep+"workspace"+sep+"RestAssured"+sep+"src"+sep+"RestAssured"+sep+"Project2"+sep+"text1.txt";
		
		
		
		
		RestAssured.baseURI = "https://reqres.in/";
				
		RequestSpecification request = RestAssured.given()
				.multiPart("file", FilePath, "application/text")
				.header("content-type","multipart/json");
		
		//request.header("content-type","application/json");
		//if you are adding document then specify the content type as multipart json
		
		
		String jsonBodyString="{\"name\": \"morpheus\",\"job\": \"leader\"}";
		request.body(jsonBodyString);
		Response response = request.post("/api/users");
		
		System.out.println(response.body().asPrettyString());
		
		//.multiPart("file", new File(TestUtil.getFileURI("/examples/help.html")), "text/html")
	}

}
