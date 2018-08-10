package java8.methodreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java8.Employee;

/**
 * 
 * @author Minh Nguyen
 * @2018 https://java.hardibee.com @Copyright
 * 
 */
public class TypeOfObjectOfInstanceMethodReference {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Minh Nguyen", "Accounts", 5000));
		empList.add(new Employee("Ngan Pham", "Admin", 3000));
				
		//sort in lambda expression
		System.out.println("-- Lambda Expression --");
		Collections.sort(empList, (e1, e2) -> e1.compare(e2));
		empList.forEach(System.out::println);
		
		//sort in Instance Method Reference
		System.out.println("-- Reference to an instance method of an arbitrary object of a particular type --");
		Collections.sort(empList, Employee::compare);
		empList.forEach(System.out::println);
		
	}
}
