package com.ing.bank.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.bank.entity.User;
import com.ing.bank.repository.UserRepository;

@Service
public class UserService {
@Autowired
UserRepository userRepository;
	public User findByaccountNo(Long accountNumber) {
		// TODO Auto-generated method stub
		return userRepository.findByaccountNo(accountNumber);
	}

}
