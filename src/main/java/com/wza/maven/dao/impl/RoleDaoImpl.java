package com.wza.maven.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.wza.maven.dao.IRoleDao;
import com.wza.maven.pojo.po.Role;

public class RoleDaoImpl extends JdbcDaoSupport implements IRoleDao {

	@Override
	public int save(Role role) {
		String sql = "insert into role values(?,?,?);";
		return getJdbcTemplate().update(sql, role.getRid(),role.getRname(), role.getAlias());
	}

	/*@Override
	public void delete(Integer id) {
		String sql = "delete from role where id = ?;";
		getJdbcTemplate().update(sql, id);
	}

	@Override
	public void update(Role role) {
		String sql = "update role set rname = ?,alias = ? where rid = ?;";
		getJdbcTemplate().update(sql, role.getRname(), role.getAlias(), role.getRid());
	}

	@Override
	public Role getById(Integer id) {
		String sql="select * from role where rid = ?;";
		Role role = (Role)getJdbcTemplate().queryForObject(sql,new Object[]{id},new RowMapper<Object>() {
			
			public Object mapRow(ResultSet resultSet,int index) throws SQLException{
				
				return mapRowHandler(resultSet);
			}
		});
		return role;
	}

	private Role mapRowHandler(ResultSet resultSet) throws SQLException{
		Role role = new Role();
		role.setRid(resultSet.getInt("rid"));
		role.setRname(resultSet.getString("rname"));
		role.setAlias(resultSet.getString("alias"));
		return role;
	}*/
}
