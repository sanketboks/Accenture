package com.app.registration.services;

import java.util.List;

import com.app.registration.entity.Book;
import com.app.registration.entity.Emp;

public interface Bookservice {
	public List<Book> getbook();
	public Emp addemp(Emp e);

}
