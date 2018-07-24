package com.dao;

import java.util.List;

import com.beans.Book;
import com.beans.Category;

public interface BookDao {

	public List<Category> getAllClasses();
	
	public List<Book> getAllbook(int num);
	
	public Category getTitle(int num);
	
	public void add(Book book,int id);
	
	public List<Book> show(String keyword,int type);
	
	public Book bookInfo(int id);
}
