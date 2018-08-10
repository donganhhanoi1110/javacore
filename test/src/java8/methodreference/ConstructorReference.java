package java8.methodreference;

import java8.Employee;
import java8.EmployeeFactory;

/**
 * 
 * @author Minh Nguyen
 * @2018 https://java.hardibee.com @Copyright
 * 
 */
public class ConstructorReference {
	public static void main(String[] args) {
		
		System.out.println("--In anonymous class way");
		EmployeeFactory empFac2 = new EmployeeFactory() {
			
			@Override
			public Employee getEmployee(String name, String department, Integer salary) {
				// TODO Auto-generated method stub
				return new Employee(name, department, salary);
			}
		};
		Employee employee2= empFac2.getEmployee("Minh 1", "IT", 5000);
		System.out.println(employee2);
		
		System.out.println("--In Lambda Expression way");
		EmployeeFactory empFac3 = (name, department, salary) -> 
				{ return new Employee(name, department, salary);};
		Employee employee3= empFac3.getEmployee("Minh 2", "IT", 6000);
		System.out.println(employee3);
		
		//Constructor Reference
		System.out.println("--In constructor ref way");
		EmployeeFactory empFac = Employee::new;
		Employee employee = empFac.getEmployee("Minh 3", "IT", 7000);
		System.out.println(employee);
		
	}
}
