package in.eshwar.services;

import in.eshwarnaz.Dao.IEmployee;
import in.eshwarnaz.entity.Employee;

public class Services {
	public IEmployee emp;

	public Services(IEmployee emp) {
		this.emp = emp;
	}

	public void saveEmployee(Employee e) {
		int i = emp.insert(e);
		if (i > 0) {
			System.out.println("Insertion scucess");
		} else {
			System.out.println("Insert fail");
		}
	}
}
