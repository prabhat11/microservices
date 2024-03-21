package com.account.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.account.model.Account;

@RestController
@RequestMapping(value="v1/api/account")
public class Accounts {
	List<Account> lstAccnt= new ArrayList<Account>();
	@GetMapping("/accounts")
	public ResponseEntity<Account> getAccounts() {
		Account account= new Account();
		account.setAccId("0000ALP1122");
		account.setUser("prabhat");
		return new ResponseEntity<>(account,HttpStatus.OK);
	} 
	
	
}
