package model_dao;

import java.util.List;

import model_entities.Seller;

public interface SellerDao {
	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	//pega o id e consulta no banco de dados um objeto com esse id, se existir retorna o objeto, se não existir retorna nulo
	Seller findById(Integer id);
	List<Seller> findAll();

}