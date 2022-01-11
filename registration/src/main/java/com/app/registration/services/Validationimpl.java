package com.app.registration.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.app.registration.dao.Bookdao;
import com.app.registration.dao.Empdao;
import com.app.registration.entity.Emp;
@ComponentScan
@Service

public class Validationimpl implements Validation{
	@Autowired
	Bookdao bookdao;
	@Autowired
	Empdao empdao;

	@Override
	public Emp fetchusereid(String email) {
		
		Emp e= empdao.findByusername(email);
		return e;
		// TODO Auto-generated method stub
		
	}

@Override
public Emp fetchusereidpassword(String email, String pwd) {
	// TODO Auto-generated method stub
	Emp e= empdao.findByUsernameAndPassword(email,pwd);
	return e;
}

}
