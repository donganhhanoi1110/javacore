package java8.streamapi;

import java8.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 *
 * @author Minh Nguyen
 * @2018 https://java.hardibee.com @Copyright
 *
 */
public class StreamAPI {

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(new Employee("Minh Nguyen", "Accounts", 5000));
        empList.add(new Employee("Ngan Pham", "Admin", 3000));
        empList.add(new Employee("Hiep Nguyen", "IT", 7000));
        empList.add(new Employee("Tung Pham", "IT", 9000));

        List<Employee> itEmployees = new ArrayList<>();
        for(Employee e: empList){
            if("IT".equals(e.getDepartment())){
                itEmployees.add(e);
            }
        }
        Collections.sort(itEmployees, new Comparator<Employee>(){
            @Override
            public int compare(Employee t1, Employee t2){
                return t2.getSalary().compareTo(t1.getSalary());
            }
        });
        List<String> employeeNames = new ArrayList<>();
        for(Employee t: itEmployees){
            employeeNames.add(t.getName());
        }
        System.out.println("--Java 7--");
        employeeNames.forEach(System.out::println);

        List<String> employeeNames2 =
                empList.stream()
                        .filter(e -> "IT".equals(e.getDepartment()))
                        .sorted(Comparator.comparing(Employee::getSalary).reversed())
                        .map(Employee::getName)
                        .collect(toList());
        System.out.println("--Java 8--");
        employeeNames2.forEach(System.out::println);
    }

}

