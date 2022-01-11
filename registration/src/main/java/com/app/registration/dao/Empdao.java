package com.app.registration.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.registration.entity.Emp;

public interface Empdao extends JpaRepository<Emp, Integer>{
	public Emp findByusername(String emp);
	public Emp findByUsernameAndPassword(String username, String password);

}
