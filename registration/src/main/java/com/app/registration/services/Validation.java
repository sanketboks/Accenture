package com.app.registration.services;

import com.app.registration.entity.Emp;

public interface Validation {
	public Emp fetchusereid(String email);
	public Emp fetchusereidpassword (String email, String pwd);
}

	

