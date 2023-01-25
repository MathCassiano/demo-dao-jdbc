package model_dao;

import model_dao_impl.SellerDaoJDBC;

public class DaoFactory {

	//ela vai expor um metodo que retorna o tipo da interface, mas internamente vai instanciar uma implementação
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
