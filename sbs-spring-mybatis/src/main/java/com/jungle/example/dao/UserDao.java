package com.jungle.example.dao;

import java.util.List;

import com.jungle.example.model.User;

public interface UserDao {
	public User getUser(User user);

	public List<User> queryUser(User user);
	
	public int addUser(User user);

	public int updateUser(User user);

	public int deleteUser(int UserId);
}