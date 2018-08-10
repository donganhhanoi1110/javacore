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
public class InstanceMethodReference {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Minh Nguyen", "Accounts", 5000));
		empList.add(new Employee("Ngan Pham", "Admin", 3000));
		
		InstanceMethodComparator instanceMethodCom = new InstanceMethodComparator();
		
		//sort in Instance Method Reference
		System.out.println("-- Anonymous class --");
		Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getSalary().compareTo(e2.getSalary());
			}
		});
		empList.forEach(System.out::println);
			
		//sort in lambda expression
		System.out.println("-- Lambda Expression --");
		Collections.sort(empList, (e1, e2) -> instanceMethodCom.compare(e1, e2));
		empList.forEach(System.out::println);
				
		//sort in Instance Method Reference
		System.out.println("-- Instance Method Reference --");
		Collections.sort(empList, instanceMethodCom::compare);
		empList.forEach(System.out::println);
		
	}
}
