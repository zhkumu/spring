package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

@Repository
public class SystemUserDao {
	
	@Resource
	private JdbcTemplate jdbcTemplate;
	
	public String getUsers(){
		final StringBuilder sb=new StringBuilder();
		jdbcTemplate.query("select * from systemuser", new Object[]{},new RowCallbackHandler() {
			
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				sb.append(rs.getString("username")+" "+rs.getString("pwd")+"\n");
			}
		});
		return sb.toString();
	}
}
