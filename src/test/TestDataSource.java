package test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.util.HtmlUtils;

public class TestDataSource {
	public static void main(String[] args) throws SQLException {
		DriverManagerDataSource source=new DriverManagerDataSource();
		source.setDriverClassName("com.mysql.jdbc.Driver");
		source.setUrl("jdbc:mysql://192.168.25.110:3306/guanli?characterEncoding=gbk");
		source.setUsername("root");
		source.setPassword("123456");
		Connection connection=source.getConnection();
		Statement statement=  connection.createStatement();
		ResultSet set= statement.executeQuery("select * from `systemuser`");
		ResultSetMetaData metaData=set.getMetaData();
		int total=metaData.getColumnCount();
		String sb="";
		while(set.next()){
			for(int i=1;i<=total;i++){
				sb+=" "+set.getString(i);
			}
		}
		System.out.println(sb);
	}
}
