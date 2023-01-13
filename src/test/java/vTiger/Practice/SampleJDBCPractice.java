package vTiger.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class SampleJDBCPractice {
	
	@Test
	public void SampleExcecutorScript() throws SQLException{
		
		Driver d=new Driver();
		
		//Step:1 to register database
		DriverManager.registerDriver(d);
		
		
		//step:2 to open   database connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/srinugumma", "root", "root");
		
		
		//step:3 to execute query
		Statement stm = con.createStatement();
		
		
		//step:4 to get the result
		ResultSet result = stm.executeQuery("select * from srinugumma");
		while(result.next()) {
		
		String data = result.getString(1)+" -"+result.getString(1)+"-"+result.getString(3)+"-"+result.getString(4)+"-"+result.getString(5);
		
		System.out.println(data);
		}
		//step:5 to close 
		
		con.close();
		
	}
	

}
