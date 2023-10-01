package com.example.demo.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.User;

public interface IService {
	public List<User> getAllData();
	public User getDataById(long id);
	public String addUserData(User u);
	public String updateUserData(long id,User u);
	public String deleteUserDataById(long id);

}
