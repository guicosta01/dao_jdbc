package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	//retorna o tipo mas internamente instancia uma impl
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}

}
