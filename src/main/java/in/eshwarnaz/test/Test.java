package in.eshwarnaz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.eshwar.services.Services;
import in.eshwarnaz.daoimpl.EmployeeDaoImpl;
import in.eshwarnaz.entity.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Services s = (Services) ctx.getBean("eserv");
		Employee e = new Employee();
		e.setId(05);
		e.setName("aravind");
		e.setSalary(40112);
		s.saveEmployee(e);
	}
}
