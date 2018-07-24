package com.beans;

import java.util.HashSet;
import java.util.Set;


/**
 * Book entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings("unchecked")
public class Book  implements java.io.Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 8696405702239351187L;
	// Fields    

     private Integer id;
     private Category category;
     private String name;
     private String author;
     private Float price;
     private String desc;
     private Set users = new HashSet(0);


    // Constructors

    /** default constructor */
    public Book() {
    }

	/** minimal constructor */
    public Book(String name, String author, Float price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    
    /** full constructor */
    public Book(Category category, String name, String author, Float price, String desc, Set users) {
        this.category = category;
        this.name = name;
        this.author = author;
        this.price = price;
        this.desc = desc;
        this.users = users;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Category getCategory() {
        return this.category;
    }
    
    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    public Float getPrice() {
        return this.price;
    }
    
    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDesc() {
        return this.desc;
    }
    
    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Set getUsers() {
        return this.users;
    }
    
    public void setUsers(Set users) {
        this.users = users;
    }
   








}