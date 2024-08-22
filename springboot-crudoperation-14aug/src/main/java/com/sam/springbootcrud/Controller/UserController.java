package com.sam.springbootcrud.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sam.springbootcrud.Service.UserService;
import com.sam.springbootcrud.User.UserData;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
    public ResponseEntity<List<UserData>> getAllUsers() {
        List<UserData> users = userService.getAllUsers(); 
        return ResponseEntity.ok(users);
    }

	@GetMapping("/{id}")
	public Optional<UserData> getUserById(@PathVariable int id) {
		return userService.getUserById(id);
	}

	@PostMapping("/user")
	public UserData createUser(@RequestBody UserData user) {
		return userService.saveUser(user);
	}

	@PutMapping("/{id}")
			public UserData updateUser(@PathVariable int id, @RequestBody UserData userDetails) {
				UserData user = userService.getUserById(id).orElseThrow();
				user.setFirst_name(userDetails.getFirst_name());
				user.setLast_name(userDetails.getLast_name());
				user.setEmail(userDetails.getEmail());
				user.setPassword(userDetails.getPassword());
				user.setMobile_number(userDetails.getMobile_number());

				return userService.saveUser(user);
			}

			@DeleteMapping("/{id}")
			public  void deleteUser(@PathVariable int id) {
			  userService.deleteUser(id);
			}
}
