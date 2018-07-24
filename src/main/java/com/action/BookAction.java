package com.action;


import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

import com.beans.Book;
import com.service.BookService;


public class BookAction {
	
	private BookService bookService;
	
	public BookService getBookService() {
		return bookService;
	}

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	public String get() {
		HttpServletRequest request = ServletActionContext.getRequest();
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		bookService.getbook(id);	
		return "success";
	}
	
	public String add() {
	
		Book book=new Book();
		HttpServletRequest request = ServletActionContext.getRequest();
		
		book.setName(request.getParameter("name"));
		book.setAuthor(request.getParameter("author"));
		book.setDesc(request.getParameter("desc"));
		book.setPrice(Float.parseFloat(request.getParameter("price")));
		int categoryid = Integer.parseInt(request.getParameter("categoryid"));
		
		bookService.add(book,categoryid);
		return "success";
	}
	
	public String show() {
		HttpServletRequest request = ServletActionContext.getRequest();
		
		String keyword = request.getParameter("keyword");
		int type = Integer.parseInt(request.getParameter("type"));

		bookService.show(keyword, type);
		return "success";
	}
	
	public String bookInfo() {
		HttpServletRequest request = ServletActionContext.getRequest();
		
		int id = Integer.parseInt(request.getParameter("bookid"));
		
		bookService.bookInfo(id);
		return "success";
	}
}
