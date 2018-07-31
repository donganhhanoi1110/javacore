package java8.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java8.Employee;

/**
 * 
 * @author Minh Nguyen
 *
 */
public class LambdaExpressionWithComparator {

	public static void main(String[] args) {
	  List<Employee> employeeList = new ArrayList<Employee>();
	  //Prepare Data before sorting
	  employeeList.add(new Employee("Minh Nguyen", "IT", 70000));
	  employeeList.add(new Employee("Ngan Pham", "HR", 80000));
	  employeeList.add(new Employee("Phuoc Nguyen", "Admin", 50000));
	  employeeList.add(new Employee("Hiep Nguyen", "IT", 90000));
	  // Print List Before Sorting
	  System.out.println("--- Employee List Before Sorting ---");
	  // Print List Using Lambda Expression
	  employeeList.forEach((item) -> System.out.println(item.toString()));
	  
	  //Sort the employeeList
	  sortWithAnonymousClass(employeeList);
	  sortWithLambdaExpressions(employeeList);
	}
	
	/**
	 * Sort a list by using Anonymous Inner Class In ASC order
	 * @param List<Employee> list
	 */
	public static void sortWithAnonymousClass(List<Employee> list) {
	  Collections.sort(list, new Comparator<Employee>() {
  	    @Override
  	    public int compare(Employee employee1, Employee employee2) {
  	      return employee1.getSalary().compareTo(employee2.getSalary());
  	    }
    });
	  //Print List using forEach method
	  System.out.println("--- Sorted List By Using Anonymous Inner Class ---");
	  list.forEach(System.out::println);
	}
	
	/**
   * Sort a list by using Lambda Expressions
   * @param List<Employee> list
   */
  public static void sortWithLambdaExpressions(List<Employee> employeeList) {
    employeeList.sort((Employee employee1, Employee employee2) -> employee1.getSalary().compareTo(employee2.getSalary()));
    System.out.println("--- Sorted List By Using Lambda - ASC order ---");
    //Print List using Method References
    employeeList.forEach(System.out::println);
    
    employeeList.sort((Employee employee1, Employee employee2) -> employee2.getSalary().compareTo(employee1.getSalary()));
    //Print List using forEach method
    System.out.println("--- Sorted List By Using Lambda - DESC order ---");
    
    //Print List using Method References
    employeeList.forEach(System.out::println);
  }
}
