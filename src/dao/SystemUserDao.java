package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class SystemUserDao {
	
	@Autowired
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
	
	public void insertUser(String userName,String pwd,int isdelete){
		String sql="insert into `systemuser`(`username`,pwd,isdelete)values(?,?,?);";
		Object[] params=new Object[]{userName,pwd,isdelete};
		jdbcTemplate.update(sql,params);
	}
	
	public int insertUser( final String userName,final String pwd){
		final String sql="insert into `systemuser`(`username`,pwd,isdelete)values(?,?);";
		KeyHolder keyHolder=new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con)
					throws SQLException {
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, userName);
				ps.setString(2, pwd);
				return ps;
			}
		},keyHolder);
		return keyHolder.getKey().intValue();
	}
	
}
