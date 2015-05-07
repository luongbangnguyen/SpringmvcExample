package com.java.spring.web.flow.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.java.spring.web.flow.dao.AccountDao;
import com.java.spring.web.flow.model.Account;
import com.java.spring.web.flow.model.Account.StatusAccount;
import com.java.spring.web.flow.service.AccountService;

@Repository(AccountService.NAME)
public class AccountServiceImpl implements AccountService{

	@Autowired
	private AccountDao accountDao;
	
	@Override
	public Account registerAcount(Account account) {
		account.setStatusAccount(StatusAccount.DIASBLE);
		Account registeredAccount = accountDao.addNewAcount(account);
		return registeredAccount;
	}

}
