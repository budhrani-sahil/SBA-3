package com.example.bookconversion;

public class BookConversion {
	private Integer bookid;
	private String bookname;
	private Double bookcost;
	private Double quantity;
	private Double totalCalcAmount;
	private String environment;
	
	public BookConversion() {
		super();
	}

	public BookConversion(Integer bookid, String bookname, Double bookcost, Double quantity, Double totalCalcAmount,
			String environment) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookcost = bookcost;
		this.quantity = quantity;
		this.totalCalcAmount = totalCalcAmount;
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

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getTotalCalcAmount() {
		return totalCalcAmount;
	}

	public void setTotalCalcAmount(Double totalCalcAmount) {
		this.totalCalcAmount = totalCalcAmount;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
}
