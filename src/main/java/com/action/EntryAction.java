package com.action;


import com.opensymphony.xwork2.ActionContext;
import com.service.BookService;

public class EntryAction {
	
	private BookService bookService;
	
	public BookService getBookService() {
		return bookService;
	}

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	public String entry() {
		bookService.getCategories();
		return "success";
	}
	
	public String out() {
		ActionContext ac =ActionContext.getContext();
		ac.getSession().remove("user");
	
		return "out";
	}
	
}
