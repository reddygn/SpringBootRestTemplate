package com.naveen.resttemplate.Service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.naveen.resttemplate.Model.Users;

@Component
public class UserService {

	public Users getUserById(int id) {
		String url = "https://jsonplaceholder.typicode.com/users/" + id;

		RestTemplate restTemplate = new RestTemplate();
		Users u = restTemplate.getForObject(url, Users.class);

		return u;
	}

	public Users[] getAllUsers() {

		String url = "https://jsonplaceholder.typicode.com/users";

		RestTemplate restTemplate = new RestTemplate();
		Users[] user = restTemplate.getForObject(url, Users[].class);

		return user;
	}

}
