package com.app.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.registration.entity.Book;
import com.app.registration.entity.Emp;
import com.app.registration.services.Bookservice;
import com.app.registration.services.Validation;

@RestController
public class Operatiom {
	@Autowired
	private Bookservice bookservice;
	@Autowired
	private Validation validation;
	
	@GetMapping("/home")
	 public String home() {
		return "HI";
	}
	@GetMapping("/submit")
	@CrossOrigin(origins="http://localhost:4200")
   public List<Book> getbooks() throws Exception
{
	
		return this.bookservice.getbook();
}
	@PostMapping("/add")
	@CrossOrigin(origins="http://localhost:4200")
	public Emp addemp(@RequestBody Emp e) throws Exception {
		Emp eobj = null;
		String uname=e.getUsername();
		if(uname!=null)
		{
		eobj=this.validation.fetchusereid(uname);
		if(eobj!=null)
		{
			throw new Exception("User with " +uname+" already present");
		}
		}
		eobj =this.bookservice.addemp(e);
		return eobj;
		
		}
	@PostMapping("/login")
	@CrossOrigin(origins="http://localhost:4200")
	public List<Book> login (@RequestBody Emp e) throws Exception
	{
		Emp obj=null;
		String uname=e.getUsername();
		String pwd=e.getPassword();
		if(uname!=null && pwd!=null)
		{
			obj=this.validation.fetchusereidpassword(uname,pwd);
			
			
		}
		if(obj==null)
		{
			throw new Exception("Bad Credentials");
			
		}
		return this.bookservice.getbook();
	}
	}


