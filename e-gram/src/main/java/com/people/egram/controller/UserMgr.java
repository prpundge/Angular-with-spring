package com.people.egram.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.people.egram.data.Users;
import com.people.egram.repo.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/users")
public class UserMgr {
	@Autowired
	UserRepository userservice;

	@GetMapping("/all")
	public List<Users> getAllUsers() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>called>>>>>>>>>>>>>>>>>>>>>>");
		return userservice.findAll();
	}

	@PostMapping("/create")
	void addUser(@RequestBody Users user) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>resource added>>>>>>>>>>>");
		userservice.save(user);
	}

	@RequestMapping("/hello")
	public String hello() {
		return "Hello!";
	}
	/*
	 * @RequestMapping(value = "/getall", method = RequestMethod.GET) public
	 * ResponseEntity<?> getAllUsers() { System.out.println("called"); List<Users>
	 * users = userService.getAllUsers(); if (users.isEmpty()) { return new
	 * ResponseEntity(HttpStatus.NO_CONTENT); // You many decide to return
	 * HttpStatus.NOT_FOUND } return new ResponseEntity<List<Users>>(users,
	 * HttpStatus.OK); }
	 */
}
