package com.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bookservice {
	@Autowired
	bookrepository br;
	public books createbook(books b) {
		return br.save(b);
		
	}
	public List<books> getallbooks(){
		return br.findAll();
	
	}
	public books getbooksById(int id) {
		return br.findById(id).get();
		
	}
	public void save(books b) {
		br.save(b);
	}
	public void delete(int id) {
		br.deleteById(id);
	}
	public books update(books b) {
		books bs=br.findById(b.getId()).get();
		bs.setId(b.getId());
		bs.setBookname(b.getBookname());
		bs.setPrice(b.getPrice());
		books update=br.save(bs);
		return update;
		
	}
}
