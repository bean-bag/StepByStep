package com.jungle.example.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;	
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jungle.example.dao.UserDao;
import com.jungle.example.model.User;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/ApplicationContext.xml"})
public class UserDaoTest {

	private final static Logger log = LoggerFactory.getLogger(UserDaoTest.class);
	
	@Autowired
	private UserDao userDao;
	@Test
	public void testGetUser() {
		User user = new User();
		user.setUsername("username");
		user.setPassword("password");
		
		//PageHelper.offsetPage(5, 5);
		
		List<User> num = userDao.queryUser(user,new RowBounds(5,5));
		assertEquals(2, num.size());
	}

	@Test
	public void testAddUser() {
		log.info("添加数据");
		User user = new User();
		user.setUsername("username");
		user.setPassword("password");
		int num = userDao.addUser(user);
		assertEquals(1, num);
	}

	@Test
	public void testUpdateUser() {
		User user = new User();
		user.setId(2);
		user.setUsername("username");
		user.setPassword("12345");
		int num = userDao.updateUser(user);
		assertEquals(1, num);
	}

	@Test
	public void testDeleteUser() {
		
	}

}
