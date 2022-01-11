package com.app.registration.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.registration.entity.Book;

public interface Bookdao extends JpaRepository<Book, Integer> {

}
