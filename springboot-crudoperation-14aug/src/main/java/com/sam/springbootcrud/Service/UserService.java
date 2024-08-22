package com.sam.springbootcrud.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.springbootcrud.Repository.UserRepository;
import com.sam.springbootcrud.User.UserData;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<UserData> getAllUsers() {
		return (List<UserData>) userRepository.findAll();
		
	}
	
	public Optional<UserData> getUserById(int id) {
		return userRepository.findById(id);
		
	}
	
	public UserData saveUser(UserData user) {
		return userRepository.save(user);
		
	}
	
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}

}
