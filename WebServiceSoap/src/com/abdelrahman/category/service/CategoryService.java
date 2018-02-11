package com.abdelrahman.category.service;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {
	
	private  List<String> books = new ArrayList<String>();
	private  List<String> movies = new ArrayList<String>();
	private  List<String> series = new ArrayList<String>();
	private  List<String> doors = new ArrayList<String>();
	
	public CategoryService(){
		books.add("Ali Co");
		books.add("Fighter Man");
		books.add("Player Man");
		books.add("Oracle Man");
		books.add("Samy OIL");
		
		movies.add("Movie 1");
		movies.add("Movie 2");
		movies.add("Movie 3");
		movies.add("Movie 4");
		movies.add("Movie 5");
		
		series.add("Series 1");
		series.add("Series 2");
		series.add("Series 3");
		series.add("Series 4");
		
		doors.add("door 1");
		doors.add("door 2");
		doors.add("door 3");
		doors.add("door 4");
		doors.add("door 5");
	}
	
	public List<String> getProductCategories(){
		List<String> ca = new ArrayList<String>();
		ca.add("Books");
		ca.add("Movies");
		ca.add("Series");
		ca.add("Progarms");
		ca.add("Doors");
		return ca;
	}
	
	public  List<String>  getProduct(String categoryName){
		if(categoryName.equalsIgnoreCase("books")){
			return books;
		}else if(categoryName.equalsIgnoreCase("movies")){
			return movies;
		}else if(categoryName.equalsIgnoreCase("series")){
			return series;
		}else if(categoryName.equalsIgnoreCase("doors")){
			return doors;
		}else{
			return null;
		}
	}
	

}
