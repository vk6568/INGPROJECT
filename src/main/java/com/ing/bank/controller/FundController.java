package com.ing.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.bank.entity.User;
import com.ing.bank.service.FundService;
import com.ing.bank.service.UserService;
@RestController
@RequestMapping("/fundtransfer")
public class FundController {
	@Autowired FundService fundService;
	@Autowired UserService userService;
	@PostMapping("/view/{accountNumber}")
	public ResponseEntity viewAccounts(@PathVariable Long accountNumber) {
		User user=userService.findByaccountNo(accountNumber);
		if(user.getFirstName().contentEquals(null)) {
			return new ResponseEntity <String> ("Please check your account number",HttpStatus.OK);
		}
		else
		{
		List<Integer> accountNumbers=fundService.getAccountNumbers(accountNumber);
		
		return new ResponseEntity <> (accountNumbers,HttpStatus.OK);
		 
	}
	}

}
