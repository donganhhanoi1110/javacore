package java8.methodreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConstructorReference {
	public static void main(String[] args) {
		
		//Constructor Reference
		System.out.println("--In constructor ref way");
		EmployeeFactory empFac = Employee::new;
		Employee employee = empFac.getEmployee("Minh", "IT", 5000);
		System.out.println(employee);
		
		System.out.println("--In normal way");
		EmployeeFactory empFac2 = new EmployeeFactory() {
			
			@Override
			public Employee getEmployee(String name, String account, Integer salary) {
				// TODO Auto-generated method stub
				return new Employee(name, account, salary);
			}
		};
		Employee employee2= empFac2.getEmployee("Minh2", "IT", 5000);
		System.out.println(employee2);
		
	}
}
