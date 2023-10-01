package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.User;
import com.example.demo.repo.IRepository;


@Service
public class UserService implements IService {

	@Autowired
	IRepository idao;
	
	@Override
	public List<User> getAllData() {
		// TODO Auto-generated method stub
		return idao.findAll();
	}

	@Override
	public User getDataById(long id) {
		// TODO Auto-generated method stub
		return idao.getReferenceById(id);
	}

	@Override
	public String addUserData(User u) {
		// TODO Auto-generated method stub
		idao.save(u);
		return "added successfully";
	}

	@Override
	public String updateUserData(long id,User u) {
		// TODO Auto-generated method stub
		if(idao.existsById(id)) {
		idao.save(u);
		return "updated successfully";
		}
		else
		{
			return "wrong id, provide correct one";
		}
	
		
	}

	@Override
	public String deleteUserDataById(long id) {
		// TODO Auto-generated method stub
		idao.deleteById(id);
		return "deleted Successfully";
	}

}
