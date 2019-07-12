package com.hcl.LoanApp1.controller;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.LoanApp1.entity.User;
import com.hcl.LoanApp1.service.UserService;

@RestController
@RequestMapping("/user")

public class UserController {
	
	@Autowired
	UserService userservice;
	
	
	
	
	
	@PostMapping("/register")
	public void LoanUser(@RequestBody User user) throws Exception{
		if (user.getSalary()<10000) throw new Exception("salary should not be 1ok below");
		LocalDate c = user.getDob();
		LocalDate cdate=LocalDate.now();
	          Period diff  =  Period.between(c,cdate );	
	          if (diff.getYears()<25) throw new Exception("Age should not be 25 years  below");
		
	}
}
