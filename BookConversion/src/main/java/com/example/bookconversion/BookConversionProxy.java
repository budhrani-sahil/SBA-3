package com.example.bookconversion;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name="book-service",url="localhost:8000")
@FeignClient(name="book-service")
public interface BookConversionProxy {
	
	@GetMapping("bookservice/getbookcost/{bookname}")
	public BookConversion retrieveExchangeValue(@PathVariable String bookname);
	
}
