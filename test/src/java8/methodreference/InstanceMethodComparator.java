package java8.methodreference;
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
