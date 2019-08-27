package com.people.egram.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.people.egram.data.Users;
import com.people.egram.repo.UserRepository;

@Service("userService")
@Transactional
public abstract class UserServiceImpl implements UserService {
	@Autowired
	UserRepository repo;

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		System.out.println("printed>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+repo.findAll());
		return (List<Users>) repo.findAll();
	}

}
