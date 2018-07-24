package com.service;


import com.beans.Book;
import com.beans.Category;

public interface BookService {
	
	public void getCategories();
	
	public void getbook(int num);
	
	public void add(Book book,int id);
	
	public void show(String keyword,int type);
	
	public void bookInfo(int id);
}
