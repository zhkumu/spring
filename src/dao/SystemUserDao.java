package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.CallableStatementCallback;
import org.springframework.jdbc.core.CallableStatementCreator;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.Statement;

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
	
	public List<String> getUsers2(){
		final StringBuilder sb=new StringBuilder();
		List<String> list= jdbcTemplate.query("select `username` from systemuser ", new Object[]{},new RowMapper<String>(){
			@Override
			public String mapRow(ResultSet resultset, int i)
					throws SQLException {
				System.out.println(i);
				return resultset.getString("username");
			}
		});
		return list;
	}
	
	public int getUsersCount(){
		final StringBuilder sb=new StringBuilder();
		return jdbcTemplate.queryForInt("select count(*) from systemuser", new Object[]{});
	}
	
	public void insertUser(String userName,String pwd,int isdelete){
		String sql="insert into `systemuser`(`username`,pwd,isdelete)values(?,?,?);";
		Object[] params=new Object[]{userName,pwd,isdelete};
		jdbcTemplate.update(sql,params);
	}
	
	public int insertUser( final String userName,final String pwd){
		final String sql="insert into `systemuser`(`username`,pwd)values(?,?);";
		KeyHolder keyHolder=new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con)
					throws SQLException {
				PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
				ps.setString(1, userName);
				ps.setString(2, pwd);
				return ps;
			}
		},keyHolder);
		return keyHolder.getKey().intValue();
	}
	
	public int[] batchUpdate(final List<String> list){
		final String sql="insert into `systemuser`(`username`,pwd)values(?,?);";
	 	int[] result= jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
			
	 		//设置参数
	 		@Override
			public void setValues(PreparedStatement ps, int index) throws SQLException {
	 			String name=list.get(index);
				ps.setString(1,name);
				ps.setString(2, "123456");
			}
			
			@Override
			public int getBatchSize() {
				return list.size();
			}
		});
	 	return result;
	}
	
	public void call(){
		String str="";
		List<SqlParameter> declaredParameters;
		jdbcTemplate.execute(str, new CallableStatementCallback() {
			@Override
			public String doInCallableStatement(
					CallableStatement callablestatement) throws SQLException,
					DataAccessException {
				callablestatement.setString(1, "");
				callablestatement.setString(2, "");
				//callablestatement.registerOutParameter(parameterIndex, sqlType);
				//callablestatement.execute(sql);
				return callablestatement.getString(1);
			}
		});
	}
}
