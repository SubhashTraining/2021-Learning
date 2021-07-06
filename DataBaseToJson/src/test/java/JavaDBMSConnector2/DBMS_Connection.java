package JavaDBMSConnector2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.google.gson.Gson;

public class DBMS_Connection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn= null;
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Business","root","admin");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from CustomerInfo where purchasedDate=CURDATE() and Location ='Asia'");
		
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCount = rsmd.getColumnCount();
		
		for(int i=1;i<=columnCount;i++)
		{
			System.out.print(rsmd.getColumnType(i)+":");
		}
		System.out.println();
		for(int i=1;i<=columnCount;i++)
		{
			System.out.print(rsmd.getColumnName(i)+":");
		}
		
		
		ArrayList<PurchaseDataClass> data = new ArrayList<>();
		PurchaseDataClass currentData ;
		
		while(rs.next())
		{
			currentData = new PurchaseDataClass();
			currentData.setCourseName(rs.getString(1));
			currentData.setPurchasedDate(rs.getString(2));
			currentData.setAmount(rs.getInt(3));
			currentData.setLocation(rs.getString(4));
			
			data.add(currentData);
				
		}
		
		
		Gson gson = new Gson().newBuilder().setPrettyPrinting().create();
		String jsonString = gson.toJson(data);
		System.out.println(jsonString);
		
		
		try(FileWriter writer = new FileWriter(new File(System.getProperty("user.dir")+File.separator+"TestData2.json")))
		{
			
			
			writer.write(jsonString);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
