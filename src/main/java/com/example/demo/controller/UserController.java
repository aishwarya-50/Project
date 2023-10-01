package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.IService;

@RestController
@CrossOrigin
public class UserController {
	
	@Autowired
	IService i;
	
	@GetMapping("/get")
	public List<User> getAll()
	{
		
		return i.getAllData();
	}
	
	@GetMapping("/get/{id}")
	public User getData(@PathVariable long id)
	{
		
		return i.getDataById(id);
	}
	
	@PostMapping("/add")
	public String addUser(@RequestBody User u)
	{
		return i.addUserData(u);
	}
	
	@PutMapping("/update/{id}")
	public String updateUser(@PathVariable long id,@RequestBody User u)
	{
		return i.updateUserData(id,u);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable long id)
	{
		return i.deleteUserDataById(id);
	}

}
