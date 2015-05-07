package com.java.spring.web.flow.service;

import com.java.spring.web.flow.model.Account;

public interface AccountService {
	public final String NAME = "accountService";
	Account registerAcount(Account acount);
}
