package com.dao;

import com.model.User;

public interface UserDAO {
	public void createUser(User user);
	public User getUserByUname(String uname);
}
