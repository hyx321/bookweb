package com.daoImp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.beans.Book;
import com.beans.Category;
import com.dao.BookDao;

public class BookDaoImp extends org.springframework.orm.hibernate5.HibernateTemplate  implements BookDao{
	public List<Category> getAllClasses(){
		List<Category> result= (List<Category>) find("from Category");
		return result;
	}

	public List<Book> getAllbook(int num) {
		List<Book> result2= (List<Book>) find("from Book where category.id=? ",num);	
		return result2;
	}
	
	public Category getTitle(int num) {
	
		List<Category> name = (List<Category>) find("from Category where id =?",num);
		return name.get(0);	
	}

	public void add(Book book, int id) {

		Session session=this.getSessionFactory().openSession();
		Transaction tr= session.beginTransaction();
		
		Category cas=(Category)session.get(Category.class, id);
		cas.getBooks().add(book);
		book.setCategory(cas);
		
		session.save(book);
		tr.commit();
	}

	public List<Book> show(String keyword, int type) {
		if(type==1){
			List<Book> bookInfo= (List<Book>) find(" from Book where name like '%"+keyword+"%'");
			return bookInfo;
		}
		else {
			List<Book> bookInfo= (List<Book>) find(" from Book where author like '%"+keyword+"%'");
			return bookInfo;
		}
	}
	
	public Book bookInfo(int id) {
		List<Book> book_info = (List<Book>) find("from Book where id =?",id);
		return book_info.get(0);
	}
	
	
}
