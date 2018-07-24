package com.serviceImp;

import com.beans.Book;
import com.dao.BookDao;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;
import com.service.BookService;

public class BookServiceImp implements BookService {

	private BookDao bookDao;
	
	public void setBookDao(BookDao bookDao){
		this.bookDao=bookDao;
	}
	
	public void getCategories() {
		ValueStack vs = ActionContext.getContext().getValueStack();
		vs.set("category_list", bookDao.getAllClasses());
	}
	
	public void getbook(int num) {
		
		ValueStack vs = ActionContext.getContext().getValueStack();
		vs.set("booklist",bookDao.getAllbook(num));
		vs.set("title", bookDao.getTitle(num).getName());
	}

	public void add(Book book, int id) {
		bookDao.add(book,id);
	}

	public void show(String keyword, int type) {
		ValueStack vs = ActionContext.getContext().getValueStack();
		vs.set("booklist",bookDao.show(keyword, type));
		vs.set("title", keyword);
	}

	public void bookInfo(int id) {
		ValueStack vs = ActionContext.getContext().getValueStack();
		vs.set("book",bookDao.bookInfo(id));	
	}

}
