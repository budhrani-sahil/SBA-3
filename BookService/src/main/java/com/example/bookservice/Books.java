package com.example.bookservice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Books {
	@Id
	private Integer bookid;
	private String bookname;
	private Double bookcost;
	private String environment;
	
	public Books() {
		super();
	}

	public Books(Integer bookid, String bookname, Double bookcost, String environment) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookcost = bookcost;
		this.environment = environment;
	}

	public Integer getBookid() {
		return bookid;
	}

	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public Double getBookcost() {
		return bookcost;
	}

	public void setBookcost(Double bookcost) {
		this.bookcost = bookcost;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
}
