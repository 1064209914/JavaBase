package com.hxd.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hxd.bean.User;
import com.hxd.dao.UserDao;
import com.hxd.util.JDBConnection;

public class UserDaoImpl implements UserDao {
	ResultSet rs = null;
	PreparedStatement ps = null;
	User user = null;
	
	
	@Override
	public void addUser(User user) {
		Connection conn = JDBConnection.getConnection();
		String sql = "insert users(name,age,phone) values(?,?,?);";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,user.getName());
			ps.setString(2,user.getAge());
			ps.setString(3,user.getPhone());
			ps.executeUpdate();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updateUser(User user) {
		Connection conn = JDBConnection.getConnection();
		String sql = " update users set name=?,age=?,phone=? where id=?;";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(4, user.getId());
			ps.setString(1, user.getName());
			ps.setString(2, user.getAge());
			ps.setString(3, user.getPhone());
			ps.executeUpdate();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteUser(int id) {
		Connection conn = JDBConnection.getConnection();
		String sql = "delete from users where id=? ;";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1,id);
			ps.executeUpdate();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public User getUserById(int id) {
		Connection conn = JDBConnection.getConnection();
		String sql = " select * from users where id=? ;";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs= ps.executeQuery();
			if (rs.next()) {
				user =new User();
				user.setId(id);
				user.setName(rs.getString("name"));
				user.setAge(rs.getString("age"));
				user.setPhone(rs.getString("phone"));
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return user;
	}

}
