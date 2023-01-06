package vTiger.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class SampleJDBCExecuteQuery {
	
	@Test
	public void sampleExecuteQuqery() throws SQLException
	{
		Driver driverRef = new Driver();
		Connection con=null;
		
		try {
		
		//Steps 1: register the database
		DriverManager.registerDriver(driverRef);
		
		//Step 2: Get the connection with db // provide db name
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wcse14db", "root", "root");
		
		//Step 3: Issue the create statement
		Statement state = con.createStatement();
		
		//Step 4: execute the query //provide table name
		ResultSet result = state.executeQuery("select * from candidat;");
		while(result.next())
		{
			String data = result.getString(1);
			if(data.equalsIgnoreCase("abc"))
			{
				System.out.println(data);
				break;
			}
			else
			{
				System.out.println("data not found");
			}
		}
		
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		finally {
			//Step 5: close the db
			con.close();
			System.out.println("db closed");
		}
		
	}

}
