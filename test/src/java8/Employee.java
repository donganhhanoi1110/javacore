package java8;

/**
 * 
 * @author Minh Nguyen
 * @2018 https://java.hardibee.com @Copyright
 * 
 */
public class Employee {
	 
    private String name;
    private String department;
    private Integer salary;
 
    public Employee(String name, String department, Integer salary) {
        super();
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
 
    @Override
    public String toString() {
      return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
    }

    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getDepartment() {
        return department;
    }
 
    public void setDepartment(String department) {
        this.department = department;
    }
 
    public Integer getSalary() {
        return salary;
    }
 
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    
    public int compare(Employee e1) {
     return this.getSalary().compareTo(e1.getSalary());
    }
}
