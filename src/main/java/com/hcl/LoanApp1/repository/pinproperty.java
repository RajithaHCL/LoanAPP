package com.hcl.LoanApp1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.LoanApp1.entity.pincode;
@Repository
public interface pinproperty extends JpaRepository<pincode,Integer>{

	pinproperty   pinnumberfind (String pinno);
}
