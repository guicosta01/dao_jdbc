package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj); //operação que insere no BD
	
	void update(Seller obj); 
	
	void deleteById(Integer id); 
	
	Seller findById(Integer id); //return null if not exist 
	
	List<Seller> findAll();
	
}
