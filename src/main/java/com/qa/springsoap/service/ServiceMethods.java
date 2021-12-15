package com.qa.springsoap.service;

import java.util.List;

public interface ServiceMethods<T> {

	//Create
	T create(T t); 
	
	//ReadAll
	List<T> readAll(); 
	
	
	//ReadByID
	T getById(long id);
	
	//Update
	T update(long id, T t);
	
	//Delete
	boolean delete(long id);
	
}
