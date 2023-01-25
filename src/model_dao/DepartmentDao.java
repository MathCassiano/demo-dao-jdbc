package model_dao;

import java.util.List;

import model_entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	//pega o id e consulta no banco de dados um objeto com esse id, se existir retorna o objeto, se não existir retorna nulo
	Department findById(Integer id);
	List<Department> findAll();

}
