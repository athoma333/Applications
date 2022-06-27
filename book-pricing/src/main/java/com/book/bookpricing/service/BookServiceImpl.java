package com.book.bookpricing.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.bookpricing.entity.Book;
import com.book.bookpricing.exceptions.BookNotFoundException;
import com.book.bookpricing.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookRepository bookrepository;
	
	@Override
	public Book findById(Integer id) throws BookNotFoundException {
		Optional<Book> response = bookrepository.findById(id);
		if(response.isEmpty()) {
			throw new BookNotFoundException("value is not present for the id: "+id);
		}else {
			return response.get();
		}
	}

	@Override
	public Book addBook(Book book) {
		return bookrepository.save(book);
	}

	@Override
	public void deleteBook(Integer id) {
		bookrepository.deleteById(id);
	}

	@Override
	public Book updateBook(Book book) {
		return bookrepository.save(book);
	}

}
