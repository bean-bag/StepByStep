package com.jungle.example.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.jungle.example.model.User;

public interface UserDao {
	
	public User getUser(User user);

	public List<User> queryUser(User user);
	
	public List<User> queryUser(User user,RowBounds RowBounds);
	
	public int addUser(User user);

	public int updateUser(User user);

	public int deleteUser(int UserId);
}