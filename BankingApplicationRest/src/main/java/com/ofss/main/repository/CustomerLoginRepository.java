package com.ofss.main.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ofss.main.domain.LoginDetails;

@Repository
public interface CustomerLoginRepository extends CrudRepository<LoginDetails,String>{
//	public LoginDetails loginByIdAndPassword(String id,String password);
	public LoginDetails findByLoginId(String loginId);
//    public LoginDetails addNewLogin(LoginDetails loginDetails);
	
}
