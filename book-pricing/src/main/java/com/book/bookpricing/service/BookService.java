package com.book.bookpricing.service;


import org.springframework.stereotype.Service;

import com.book.bookpricing.entity.Book;
import com.book.bookpricing.exceptions.BookNotFoundException;

@Service
public interface BookService {
	public Book findById(Integer id) throws BookNotFoundException;
	
	public Book addBook(Book book);
	
	public void deleteBook(Integer id);
	
	public Book updateBook(Book book);
}

