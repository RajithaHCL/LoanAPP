package com.hcl.LoanApp1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.LoanApp1.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User , Long>{
	List<LoanOffer>findbyloanammount(long UserLoanAmount);

}
