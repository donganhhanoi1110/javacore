package java8.methodreference;

import java8.Employee;

/**
 * 
 * @author mnguyen74
 *
 */
public class InstanceMethodComparator {
	public int compare (Employee e1, Employee e2) {
		return e1.getSalary().compareTo(e2.getSalary());
	}
}
