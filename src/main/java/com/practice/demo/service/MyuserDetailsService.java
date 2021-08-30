package com.practice.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.practice.demo.model.MyUserDetails;
import com.practice.demo.model.Users;
import com.practice.demo.repository.UserRepository;

@Service
public class MyuserDetailsService implements UserDetailsService{

	@Autowired
	UserRepository userrepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		//here you will call database connection
		Users user=null;
		try {
			System.out.println(username);
		user=userrepository.findByusername(username);
	      System.out.println(user);
	    if(user!=null) {
	    	System.out.println("User Exists");
	    	
	    	
	    }else {
			throw new UsernameNotFoundException("User Not Found!");

	    }
	      
		}catch (Exception e) {
			// TODO: handle exception
			throw new UsernameNotFoundException("User Not Found!");
		}
		
		return new MyUserDetails(user);
	}

}
