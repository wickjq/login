package ki.dao;

import java.util.List;

import ki.entity.Emp;

public interface EmpDao {
	public List<Emp> findAll(); 
	
	public Emp findById(int id);
	
	public void save(Emp emp);
	
	public void update(Emp emp);
	
	public void delete(int id);
}
