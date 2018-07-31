package java8.methodreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java8.Employee;

public class InstanceMethodReference {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Minh Nguyen", "Accounts", 5000));
		empList.add(new Employee("Ngan Pham", "Admin", 3000));
		
		InstanceMethodComparator instanceMethodCom = new InstanceMethodComparator();
		//sort in Instance Method Reference
		Collections.sort(empList, instanceMethodCom::compare);
		empList.forEach(System.out::println);
		
		//sort in lambda expression
		Collections.sort(empList, (e1, e2) -> instanceMethodCom.compare(e1, e2));
		empList.forEach(System.out::println);
	
	}
}
