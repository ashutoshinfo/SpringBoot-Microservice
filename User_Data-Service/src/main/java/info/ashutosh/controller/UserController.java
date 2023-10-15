package info.ashutosh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import info.ashutosh.domain.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping(value = "/{userId}")
	public User getUserInfo(@PathVariable Long userId) {
		return new User(1L, "Ashutosh", "ashutosh");
	}

}
