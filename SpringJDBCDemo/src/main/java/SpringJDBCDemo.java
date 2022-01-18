import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.torryharris.SpringJDBCDemo.config.EmployeeConfig;
import com.torryharris.SpringJDBCDemo.dao.EmployeeDAO;
import com.torryharris.SpringJDBCDemo.model.Employee;

public class SpringJDBCDemo {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);
		
		System.out.println("Employee Details:---");
		for(Employee emp:employeeDAO.getAllEmployees()) {
			System.out.println(emp);
		}
		
		System.out.println("\n Search by Employee ID: 1003---");
		Employee empById = employeeDAO.getEmployeeById(1003);
		System.out.println(empById);
		
		Employee e1 = new Employee(1010, "Saaketh", "Architect", 100000, 200000);
		employeeDAO.insertEmployee(e1);
		//employeeDAO.deleteEmployee(e1);
		
		empById.setDesignation("HR Manager");
		employeeDAO.updateEmployee(empById);
		
		System.out.println("\nEmployee Details after Deleting:---");
		
		for(Employee emp:employeeDAO.getAllEmployees()) {
			System.out.println(emp);
		}
	}
}
