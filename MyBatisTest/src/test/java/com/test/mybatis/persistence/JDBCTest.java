package com.test.mybatis.persistence;

import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class JDBCTest {
	
	@Test
	public void testConnection() {
		
		try {
			
			Class.forName("orecle.jdbc.driver.OracleDraiver");
			
			Connection conn = DriverManager.getConnection("jdbc:orecle:thin:@localhost:1521:xe", "hr", "java1234");
			
			System.out.println(conn.isClosed());
			
			assertNotNull(conn);
				
		} catch (Exception e) {
			
			e.printStackTrace();
		
		}
		
	}

}
