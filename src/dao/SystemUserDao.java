package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

@Repository
public class SystemUserDao {

	@Resource
	private JdbcTemplate jdbcTemplate;

	public String getUsers() {
		final StringBuilder sb = new StringBuilder();
		jdbcTemplate.execute("INSERT INTO `systemuser`(`username`,pwd,isdelete,remark)VALUES('smell','123456',0,'')");
		jdbcTemplate.query("select * from `systemuser`", new Object[] {},
				new RowCallbackHandler() {
					@Override
					public void processRow(ResultSet set) throws SQLException {
						sb.append(set.getString("username")+" "+set.getString("pwd"));
					}
				});
		return sb.toString();
	}
}
