package ki.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

import ki.dao.EmpDao;
import ki.entity.Emp;

@Service
public class EmpService {
	@Resource
	private EmpDao empDao;
	
	public List<Emp> findAll(){
		List<Emp> list = empDao.findAll();
		return list;
	}
	
	public Emp findById(int id){
		Emp emp = empDao.findById(id);
		return emp;
	}
	
	public void save(Emp emp){
		empDao.save(emp);
	}
	
	public void update(Emp emp){
		empDao.update(emp);
	}
	
	public void deleteById(int id){
		empDao.delete(id);
	}
}
