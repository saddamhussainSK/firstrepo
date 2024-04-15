package com.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bookcontroller {
	@Autowired
	bookservice bs;
	@GetMapping("/b")
	private List<books> getAllBooks(){
		return bs.getallbooks();
	}
	@GetMapping("/b/{bookid}")
	private books getBooks(@PathVariable("/bookprice") int bookprice) {
		return bs.getbooksById(bookprice);
	}
	@DeleteMapping("/b/{bookid}")
	private void deletebook(@PathVariable("bookprice")int bookById) {
		bs.delete(bookById);
	}
	@PutMapping("/b")
	private books update(@RequestBody books b) {
		bs.save(b);
		return b;
	}
}
