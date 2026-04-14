package com.example.api_gen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/user")
	public UserResponse user() {
		return new UserResponse(1, "Joh", "doe", 28, "male", "john.doe@email.com");
	}

}
