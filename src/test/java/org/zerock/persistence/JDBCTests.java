package org.zerock.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testConnecction() {
		try(Connection con =
			DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/sts_db?useSSL=false&serverTimezone=Asia/Seoul",
					"root",
					"123qwe"
				)){
			
			log.info(con);
		} catch (Exception e) {
			fail(e.getMessage());
			}
		}
	
}
