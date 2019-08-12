package com.ing.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.bank.entity.FundTransfer;
import com.ing.bank.entity.User;
import com.ing.bank.service.FundService;

@RestController
@RequestMapping("/fundtransfer")
public class FundController {
	@Autowired FundService fundService;
	@PostMapping("/view/{accountNumber}")
	public ResponseEntity viewAccounts(@PathVariable Long accountNumber) {
		List<Integer> accountNumbers=fundService.getAccountNumbers(accountNumber);
		return new ResponseEntity <> (accountNumbers,HttpStatus.OK);
		 
	}
	

}
