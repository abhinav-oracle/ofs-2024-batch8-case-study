package com.ofss.main.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofss.main.domain.LoginDetails;
import com.ofss.main.repository.CustomerLoginRepository;

@Service
public class CustomerLoginServiceImpl implements CustomerLoginService{

    @Autowired
    private CustomerLoginRepository customerLoginRepository;


	@Override
	public LoginDetails loginByIdAndPassword(String id, String password) {
		LoginDetails loginDetails = customerLoginRepository.findByLoginId(id);
		if(loginDetails != null) {
			if(loginDetails.getLoginAttempts()<3) {
				if(loginDetails.getLoginPassword()==password) {
					System.out.println("Login Successfull");
					loginDetails.setLoginAttempts(0);
					loginDetails.setLoginStatus("ACTIVE");
					return loginDetails;
				}
				else {
					System.out.println("Incorrect password");
					int attempts = loginDetails.getLoginAttempts();
					attempts += 1;
					loginDetails.setLoginAttempts(attempts);
					if(loginDetails.getLoginAttempts()>=3) {
						loginDetails.setLoginStatus("BLOCKED");
						System.out.println("Your account is blocked. Contact admin");
					}
				}
			}
			else {
				System.out.println("Your account is blocked. Contact admin");
			}
		}
		else {
			System.out.println("Incorrect loginId");
		}
		return null;
	}

	@Override
	public LoginDetails findByLoginId(String loginId) {
		Optional<LoginDetails> optional= customerLoginRepository.findById(loginId);
		if (optional.isPresent()) {
            return optional.get();
        }
		return null;
	}

	@Override
	public LoginDetails addNewLogin(LoginDetails loginDetails) {
		LoginDetails loginDetails2 = customerLoginRepository.save(loginDetails);
		return loginDetails2;
	}   
    
}
