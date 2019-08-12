package com.ing.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ing.bank.repository.UserRepository;

@Service
public class FundService {
@Autowired UserRepository userRepository;
public List<Integer> getAccountNumbers(Long accountNumber){
	return userRepository.getAccountNumbers(accountNumber);
	
}
}
