package java8.methodreference;

import java8.Employee;

/**
 * 
 * @author Minh Nguyen
 * @2018 https://java.hardibee.com @Copyright
 * 
 */
public class InstanceMethodComparator {
	public int compare (Employee e1, Employee e2) {
		return e1.getSalary().compareTo(e2.getSalary());
	}
}
