package com.app.registration.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.app.registration.dao.Bookdao;
import com.app.registration.dao.Empdao;
import com.app.registration.entity.Book;
import com.app.registration.entity.Emp;
@ComponentScan
@Service
public class Bookservicesimpl implements Bookservice {
	@Autowired
	Bookdao bookdao;
	@Autowired
	Empdao empdao;
	List<Book> blist;
	List<Emp> Elist;
	public Bookservicesimpl()
	{
		blist=new ArrayList<>();
		/*
		 * blist.add(new Book("hp","jk.row","fictional", 22)); blist.add(new
		 * Book("hp2","jk.row","fictional",23)); blist.add(new
		 * Book("hp3","jk.row","fictional",24)); blist.add(new
		 * Book("hp3","jk.row","fictional",24564));
		 */

	}

	@Override
	public List<Book> getbook() {
		
		// TODO Auto-generated method stub
		return bookdao.findAll() ;
	}

	@Override
	public Emp addemp(Emp e) {
		// TODO Auto-generated method stub
		//Elist.add(e);
		empdao.save(e);
		return e;
		
	}
	
	

}
