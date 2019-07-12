package com.hcl.LoanApp1.service;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.LoanApp1.entity.User;
import com.hcl.LoanApp1.entity.pincode;
import com.hcl.LoanApp1.repository.LoanRepo;
import com.hcl.LoanApp1.repository.UserRepository;

import io.swagger.models.properties.PasswordProperty;
@Entity
public class UserService<Loanoffer> {
	
	@Autowired
	LoanRepo loanrepo;
	
	@Autowired
	 UserRepository userrepositoy;
	@Autowired
	PasswordProperty  pinproperty;

	private Object loanofferList;

	private Object loanoffer;
	
	
	public List<Loanoffer> LoanUser(User user){
		userrepositoy.save(user);
//		pincode  pindata =( pinproperty).pinnumberfind (user.getPropertyPincode());
//		if(user.getPropertyareasize()*pindata.propertyValue()<500000)
//			throw new Exception("user not found");
//		     long  userLoanAmount= (long)(.8*(user.getPropertyareasize()*pindata.get.propvalue()));
//		       Object useLoanammoun;
//			List<Loanoffer>  loanoffer=(List<Loanoffer>) LoanRepo.findByLoanAmmount(useLoanammoun);
//		       return loanoffer;
		    		   
			return null;
			
		
		
		
		
		
}
}