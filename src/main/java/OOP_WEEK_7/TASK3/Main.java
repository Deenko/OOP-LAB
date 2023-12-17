package OOP_WEEK_7.TASK3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Employee> employees = Arrays.asList(
        new Employee(13, "Rambo", 1300.0),
        new Employee(133, "Ram3bo", 1500.0),
        new Employee(15, "Rambo", 1000.0),
        new Employee(11, "Rambo", 1250.0));

        EmployeeManagmentSystem employeeManagmentSystem = new EmployeeManagmentSystem(employees);


        employeeManagmentSystem.filterEmployeeBySalary(employees, 1250.0);

        employeeManagmentSystem.calculateTotalSalary(employees);

        employeeManagmentSystem.displayEmployeeDetails(employees);

        employeeManagmentSystem.calculateAverageSalary(employees);

    }
}
