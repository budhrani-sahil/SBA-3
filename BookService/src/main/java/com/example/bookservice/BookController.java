package com.example.bookservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {
	
	@Autowired
	private BookRepository repo;
	
	@Autowired
	private Environment env;

	@GetMapping("bookservice/getbookcost/{bookname}")
	public Books retrieveExchangeValue(@PathVariable String bookname)
	{
		String port=env.getProperty("local.server.port");
		Books books = repo.findByBookname(bookname);
		books.setEnvironment(port);
		return books;
	}
}
