package com.desh.shopping_cart_backend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.desh.shopping_cart_backend.dao.CategoryDAO;
import com.desh.shopping_cart_backend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {

		Category category = new Category();

		// Adding first category

		category.setId(1);
		category.setName("Television");
		category.setDescription("This is description of Television");
		category.setImageURL("CAT_1.png");

		categories.add(category);

		// Adding Second category
	    category=new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is description of Mobile");
		category.setImageURL("CAT_2.png");

		categories.add(category);

		// Adding Third category
		 category=new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is description of Laptop");
		category.setImageURL("CAT_3.png");

		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		//enhance for loop
		for(Category category : categories) {
			if(category.getId() == id)return category;
		}
		
		return null;
			
		}
		
		
	}


