package com.itheima.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;

public class UserDaoImpl extends JdbcDaoSupport implements UserDao {
	//继承JdbcDaoSupport后，调用父类super.getJdbcTemplate()方法获得JdbcTemplate
/*	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
*/
	public void save(User user) {
		String sql = "insert into t_user values(null,?)";
		//jt.update(sql, user.getName());
		super.getJdbcTemplate().update(sql, user.getName());
	}

	public void del(User user) {
		String sql = "delete from t_user where id=?";
		super.getJdbcTemplate().update(sql, user.getId());
	}

	public void update(User user) {
		String sql = "update t_user set name=? where id =?";
		super.getJdbcTemplate().update(sql, user.getName(), user.getId());
	}

	public User findById(Integer id) {
		String sql = "select * from t_user where id =?";
		return super.getJdbcTemplate().queryForObject(sql, new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int arg1) throws SQLException {
				User u = new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				return u;
			}
		}, id);
	}

	public int findPage() {
		String sql = "select count(*) from t_user ";
		return super.getJdbcTemplate().queryForObject(sql, Integer.class);
	}

	public List<User> findAll() {
		String sql = "select * from t_user ";
		List<User> list = super.getJdbcTemplate().query(sql, new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int arg1) throws SQLException {
				User u = new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				return u;
			}
		});
		return list;
	}

}
