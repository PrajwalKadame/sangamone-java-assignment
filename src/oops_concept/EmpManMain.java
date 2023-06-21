package oops_concept;

import java.util.ArrayList;
import java.util.List;

class Employee33 {
    int id;
    String name;
    double salary;

    public Employee33(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

class EmployeeManagement {
    	 List<Employee33> employeeList = new ArrayList<>();

    public void addEmployee(Employee33 employee) {
        employeeList.add(employee);
    }

    public void updateEmployee(int id, String newName, double newSalary) {
        for (Employee33 employee : employeeList) {
            if (employee.getId() == id) {
                employee.name = newName;
                employee.salary = newSalary;
                break;
            }
        }
    }

    public void deleteEmployee(int id) {
        Employee33 employeeToRemove = null;
        for (Employee33 employee : employeeList) {
            if (employee.getId() == id) {
                employeeToRemove = employee;
                break;
            }
        }
        if (employeeToRemove != null) {
            employeeList.remove(employeeToRemove);
        }
    }

    public void printEmployeeList() {
        for (Employee33 employee : employeeList) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName() + ", Salary: " + employee.getSalary());
        }
    }
}

public class EmpManMain {
    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement();

  
        Employee33 employee1 = new Employee33(1, "PK", 50000);
        Employee33 employee2 = new Employee33(2, "KP", 80000);
        management.addEmployee(employee1);
        management.addEmployee(employee2);

    
        management.printEmployeeList();
        management.updateEmployee(1, "JK", 55000);
        management.deleteEmployee(2);
        management.printEmployeeList();
    }
}

