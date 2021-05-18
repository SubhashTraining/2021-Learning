package RestAssured.Project1;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETRequest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		        
		RestAssured.useRelaxedHTTPSValidation();
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://demoqa.com/utilities/weather/city";
		
		// Get the RequestSpecification of the request that you want to sent
		 // to the server. The server is specified by the BaseURI that we have
		 // specified in the above step.
		 RequestSpecification httpRequest = RestAssured.given();
		 
		 Response response = httpRequest.request(Method.GET, "/Hyderabad");
		 System.out.println(response.getBody().asString());
		 
		 //check the status code - Successfull status code  200
		 int status = response.getStatusCode();
		 System.out.println("Status Code:"+status);
		 
		 
		 
		 //Unsuccessfull status code
		 
		 response = httpRequest.get("/78789798798");
		 System.out.println(response.getBody().asString());
		 System.out.println("Unsuccessfull Status Code:"+response.getStatusCode());
		 System.out.println(response.getStatusLine());//HTTP/1.1 200 OK
		 
		 
		 
		String sep = File.separator; 
		BufferedInputStream bfs = new BufferedInputStream(new FileInputStream("C:"+sep+"Users"+sep+"778294"+sep+"workspace"+sep+"RestAssured"+sep+"src"+sep+"RestAssured"+sep+"Project1"+sep+"Json1.json"));
		
		StringBuffer sb = new StringBuffer();
		int c;
		while((c=bfs.read())!=-1 )
		{
			sb.append((char)c);
		}
		
		
		String jsonString1 = new String(sb.toString());
		
		
		String jsonString = new String(Files.readAllBytes(Paths.get("C:"+sep+"Users"+sep+"778294"+sep+"workspace"+sep+"RestAssured"+sep+"src"+sep+"RestAssured"+sep+"Project1"+sep+"Json1.json")));
		
		
		if(jsonString1.equals(jsonString))
		{
			System.out.println("The two jsons are equal");
		}
		else{
			System.out.println("The json Strings are not equal");
		}
		 
		 
		 
		 
		 
	}

}
