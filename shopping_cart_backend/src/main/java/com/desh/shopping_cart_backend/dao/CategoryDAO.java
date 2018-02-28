package com.desh.shopping_cart_backend.dao;

import java.util.List;

import com.desh.shopping_cart_backend.dto.Category;

public interface CategoryDAO {
	
	List<Category>list();
	Category get(int id); 

}
