package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj); //operação que insere no BD
	
	void update(Department obj); 
	
	void deleteById(Integer id); 
	
	Department findById(Integer id); //return null if not exist 
	
	List<Department> findAll();
	
}
