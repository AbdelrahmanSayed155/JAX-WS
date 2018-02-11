package com.abdelrahman.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.abdelrahman.category.service.CategoryService;

@WebService
public class ProductCategory {
	
	CategoryService cateService =  new CategoryService();
//	@WebMethod
//	public List<String> getProductCategories(){
//		return cateService.getProductCategories();
//	}
	@WebMethod
	public List<String> getProducts(String categoryName){
		return cateService.getProduct(categoryName);
	}
	
}
