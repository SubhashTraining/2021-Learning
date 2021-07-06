package JavaDBMSConnector;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.google.gson.Gson;


public class FetchCustomerInfoData {
	
	public static void main(String[] agrs) throws ClassNotFoundException, SQLException, IOException
	{
		ResultSet rs= getCustomerInfo();
		rs.next();
		System.out.println(rs.getRow());
		
		
	}
	
	
	public static ResultSet getCustomerInfo() throws ClassNotFoundException, SQLException, IOException
	{
			Class.forName("com.mysql.cj.jdbc.Driver");//Loads the DriverClass by the DynamicLoader, dynamically at runtime
			Connection conn = null;
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Business","root","admin");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from CustomerInfo where purchasedDate=CURDATE() ");
			int count=0;
			
			
			//Create an Array of PurchaseDate 
			PurchaseData[] data = new PurchaseData[5];
			PurchaseData currentData;
			while(rs.next())
			{
				currentData= new PurchaseData();
				
				currentData.setCourseName(rs.getString(1));
				currentData.setPurchasedDate(rs.getString(2));
				currentData.setAmount(rs.getInt(3));
				currentData.setLocation(rs.getString(4));
				data[count]=currentData;
				count++;
			}
			
			
			
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("ColumnCount:"+rsmd.getColumnCount());
			System.out.println("RowCount:"+count);
			//12:91:4:12
			for(int i=1;i<=rsmd.getColumnCount();i++)
			{
				System.out.print(rsmd.getColumnType(i)+":");
			}
			System.out.println();
			//CourseName:PurchasedDate:Amount:Location:
			for(int i=1;i<=rsmd.getColumnCount();i++)
			{
				System.out.print(rsmd.getColumnName(i)+":"); 
			}
			System.out.println();
			//If you close the connection the statement and the result set will also be closed
			//conn.close();
			//st.close();
			
			
			Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
			
			String jsonString = gson.toJson(data);
			System.out.println("___________________________________________");
			System.out.println(jsonString);
			
			
			try(FileWriter writer = new FileWriter(new File(System.getProperty("user.dir")+File.separator+"TestData.json")))
			{
				
				writer.write(jsonString);
				
			}
			
			
			
			
			
			return rs;
			
	}
	
	

}
