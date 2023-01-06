package vTiger.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class SampleJDBCExecuteUpdate {
	
	@Test
	public void sampleExecuteUpdate() throws SQLException
	{
        Driver driverRef = new Driver();
		
		//Steps 1: register the database
		DriverManager.registerDriver(driverRef);
		
		//Step 2: Get the connection with db // provide db name
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wcse14db", "root", "root");
		
		//Step 3: Issue the create statement
		Statement state = con.createStatement();
		
		//Step 4: execute the query //provide table name
		String query = "insert into candidateinfo values('Ritu','Banglore',18)";
		int result = state.executeUpdate(query);
		if(result==1)
		{
			System.out.println("data added");
		}
		else
		{
			System.out.println("data not added");
		}
		
		ResultSet result1 = state.executeQuery("select * from candidateinfo;");
		while(result1.next())
		{
			System.out.println(result1.getString(1)+" "+result1.getString(2)+" "+result1.getString(3));
		}
		
		//Step 5: close the db
		con.close();
		System.out.println("db closed");
	}

}
