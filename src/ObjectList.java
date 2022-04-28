import java.sql.SQLOutput;
import java.util.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ObjectList {
    public void addEmployee(){


    }
    public static void showEmployee(List<Employee>eList){
    for(Employee emp: eList){
        System.out.println("Employee Name: "+ emp.getName());
        System.out.println("Employee Age: "+ emp.getAge());
    }

    }

    public static void main(String[] args){
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee();
        emp1.setName("John");
        emp1.setAge(30);
        employeeList.add(emp1);
        Employee emp2 = new Employee();
        emp2.setName("Harry");
        emp2.setAge(32);
        employeeList.add(emp2);
        Employee emp3 = new Employee();
        emp3.setName("Mary");
        emp3.setAge(32);
        employeeList.add(emp3);
        showEmployee(employeeList);


    }
}
