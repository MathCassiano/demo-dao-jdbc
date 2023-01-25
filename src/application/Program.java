package application;

import java.util.Date;

import model_dao.DaoFactory;
import model_dao.SellerDao;
import model_entities.Department;
import model_entities.Seller;

public class Program {
	public static void main(String[] args) {
		
		
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
		System.out.println(seller);
		
		// meu programa n conhece a implementação, apenas a interface.
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
	}

}
