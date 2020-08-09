package com.naveen.resttemplate.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.resttemplate.Model.Users;
import com.naveen.resttemplate.Service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping(value = "/user/{id}")
	@ResponseBody
	public Users getUserById(@PathVariable int id) {

		return userService.getUserById(id);
	}

	@GetMapping(value = "/users")
	@ResponseBody
	public Users[] getAllUsers() {

		return userService.getAllUsers();
	}
}
