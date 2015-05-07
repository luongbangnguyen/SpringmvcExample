package com.java.spring.web.flow.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.java.spring.web.flow.dao.AccountDao;
import com.java.spring.web.flow.model.Account;

@Service(AccountDao.NAME)
@Transactional(propagation=Propagation.SUPPORTS)
public class AcountDaoImpl implements AccountDao{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public Account addNewAcount(Account account) {
		if(account == null){
			throw new IllegalArgumentException("account not empty");
		}
		if(account.getId() == 0){
			em.persist(account);
		}else{
			em.merge(account);
		}
		return account;
	}

}
