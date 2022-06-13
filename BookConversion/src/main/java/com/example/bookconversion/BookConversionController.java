package com.example.bookconversion;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BookConversionController {
	
	@Autowired
	private BookConversionProxy proxy;
	
	@GetMapping("/studentservice/findCost/{bookname}/quantity/{quantity}")
	public BookConversion getBookCosts(@PathVariable String bookname,@PathVariable double quantity) {
		BookConversion bookConversion=proxy.retrieveExchangeValue(bookname);
		return new BookConversion(bookConversion.getBookid(),bookname,bookConversion.getBookcost(),quantity,
				quantity*bookConversion.getBookcost(),bookConversion.getEnvironment());
	}
	

}
