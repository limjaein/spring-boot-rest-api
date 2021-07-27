package com.example.demo.user;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	public List<User> getUsers() {
		return List.of(
				new User(
						"limjaein00",
						"limjaein",
						"pwd",
						LocalDate.of(1996, Month.NOVEMBER, 27)
				)
		);
	}
}
