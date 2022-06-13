package com.example.bookservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Books, Integer> {

	public Books findByBookname(String bookname);

	
}
