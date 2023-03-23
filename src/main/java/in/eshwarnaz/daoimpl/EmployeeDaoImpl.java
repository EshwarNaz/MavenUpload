package in.eshwarnaz.daoimpl;

import org.springframework.jdbc.core.JdbcTemplate;

import in.eshwarnaz.Dao.IEmployee;
import in.eshwarnaz.entity.Employee;

public class EmployeeDaoImpl implements IEmployee {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public int insert(Employee e) {
		String insert = "insert into employee2 values('" + e.getId() + "','" + e.getName() + "','" + e.getSalary()
				+ "')";
		return jdbcTemplate.update(insert);
	}

}
