package com.example.demoMySQL;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class DemoMySqlApplicationTests {

	@Autowired
	private DataSource defaultDataSource;

	@Test
	public void dataSourceTest() throws SQLException{
		Connection connection = defaultDataSource.getConnection();
		System.out.print("获取链接： ");
		System.out.println(connection != null);
		connection.close();
	}
	@Test
	void contextLoads() {
	}

}
