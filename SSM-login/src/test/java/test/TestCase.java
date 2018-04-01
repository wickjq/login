package test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ki.dao.EmpDao;
import ki.dao.UserDao;
import ki.entity.Emp;
import ki.entity.User;
import ki.service.EmpService;

public class TestCase {
	@Test
	public void test1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		EmpDao dao = ac.getBean("empDao",EmpDao.class);
		List<Emp> list = dao.findAll();
		System.out.println(list);
	}
	
	@Test
	public void test2(){
		String url = "spring-mvc.xml";
		String url1 = "spring-mybatis.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(url,url1);
		EmpService empService = ac.getBean("empService",EmpService.class);
		List<Emp> list = empService.findAll();
		System.out.println(list);
		System.out.println("service over!");
	}
	
	@Test
	public void test3(){
		String url = "spring-mvc.xml";
		String url1 = "spring-mybatis.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(url,url1);
		EmpDao dao = ac.getBean("empDao",EmpDao.class);
		Emp e = new Emp();
		e.setName("秋明");
		e.setAge(22);
		e.setSalary(30000);
		e.setId(4);
		dao.update(e);
		
		System.out.println("over!");
	}
	
	@Test
	public void test4(){
		String url = "spring-mvc.xml";
		String url1 = "spring-mybatis.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(url,url1);
		UserDao dao = ac.getBean("userDao",UserDao.class);
		User user = new User();
		user.setUsername("ki");
		user.setPassword("123456");
		
		dao.save(user);
		System.out.println("over!");
		
	}
}
