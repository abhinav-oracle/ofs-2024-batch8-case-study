package com.ofss.main.service;
import org.springframework.stereotype.Service;

import com.ofss.main.domain.LoginDetails;

@Service
public interface CustomerLoginService {
	public LoginDetails loginByIdAndPassword(String id,String password);
	public LoginDetails findByLoginId(String loginId);
    public LoginDetails addNewLogin(LoginDetails loginDetails);
}