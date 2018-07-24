package com.beans;

import java.util.HashSet;
import java.util.Set;


/**
 * User entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings("unchecked")
public class User  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 5526801259289854713L;
	private Integer id;
	private String name;
	private String passwd;
	private Integer privilege;
	private Set books = new HashSet(0);


    // Constructors

    /** default constructor */
    public User() {
    }

	/** minimal constructor */
    public User(String name, Integer privilege) {
        this.name = name;
        this.privilege = privilege;
    }
    
    /** full constructor */
    public User(String name, String passwd, Integer privilege, Set books) {
        this.name = name;
        this.passwd = passwd;
        this.privilege = privilege;
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

    public String getPasswd() {
        return this.passwd;
    }
    
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Integer getPrivilege() {
        return this.privilege;
    }
    
    public void setPrivilege(Integer privilege) {
        this.privilege = privilege;
    }

    public Set getBooks() {
        return this.books;
    }
    
    public void setBooks(Set books) {
        this.books = books;
    }
   








}