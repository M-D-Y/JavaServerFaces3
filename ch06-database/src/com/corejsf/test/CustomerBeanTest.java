package com.corejsf.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.postgresql.jdbc3.Jdbc3PoolingDataSource;

import org.junit.Test;
import com.corejsf.CustomerBean;

public class CustomerBeanTest {

	@Test
	public void testGetAll() {
		//System.out.println(System.getProperty("file.encoding"));
		Jdbc3PoolingDataSource source = new Jdbc3PoolingDataSource();
		//jdbc:postgresql://localhost:5432/coreJSF
		source.setDataSourceName("A coreJSF Data Source");
		source.setServerName("localhost");
		source.setPortNumber(5432);
		source.setDatabaseName("coreJSF");
		source.setUser("postgres");
		source.setPassword("postgres");
		source.setMaxConnections(10);
		//Then code to use a connection from the pool might look like this. Note that it is critical that the connections are eventually closed. Else the pool will "leak" connections and will eventually lock all the clients out.

		Connection con = null;
		try {
		    con = source.getConnection();
		    Statement stmt = con.createStatement();
		    ResultSet queryResult = stmt.executeQuery("SELECT * FROM Customers");   
		    while( queryResult.next() ){
		    	System.out.println(queryResult.getString(1) + " - " + queryResult.getString(2));
		    }
		    // use connection
		} catch (SQLException e) {
		    // log error
		} finally {
		    if (con != null) {
		        try { con.close(); } catch (SQLException e) {}
		    }
		}	

	}
}
