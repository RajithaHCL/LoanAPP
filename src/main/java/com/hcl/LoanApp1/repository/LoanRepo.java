package com.hcl.LoanApp1.repository;

import java.util.List;

import org.hibernate.annotations.Loader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.LoanApp1.entity.User;
@Repository
public interface LoanRepo extends JpaRepository<User , Long>{

//	@Query(value="select* from loanoffer where loanamount<=:userloanamount",nativeQuery=true)
//    List<Loader> findByLoanAmmount(Object useLoanammoun) {
//		// TODO Auto-generated method stub
//		
//	}
	
}
