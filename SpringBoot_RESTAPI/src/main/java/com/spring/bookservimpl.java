package com.spring;

import java.util.List;

public interface bookservimpl {
	books createbook(books b);
	books getbookById(int bookid);
	List<books> getallbooks();
	books update(books b);
	void delete(int bookid);
}	
