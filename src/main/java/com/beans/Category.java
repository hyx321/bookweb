package com.beans;

import java.util.HashSet;
import java.util.Set;


/**
 * Category entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings("unchecked")
public class Category  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = -4908801064204848612L;
	private Integer id;
    private String name;
    private Set books = new HashSet(0);


    // Constructors

    /** default constructor */
    public Category() {
    }

	/** minimal constructor */
    public Category(String name) {
        this.name = name;
    }
    
    /** full constructor */
    public Category(String name, Set books) {
        this.name = name;
        this.books = books;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Set getBooks() {
        return this.books;
    }
    
    public void setBooks(Set books) {
        this.books = books;
    }
   








}