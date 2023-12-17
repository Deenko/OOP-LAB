package OOP_WEEK_7.TASK3;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagmentSystem {

    List<Employee> employees;


    public EmployeeManagmentSystem(List<Employee> employees){
        this.employees = employees;
    }
    void filterEmployeeBySalary(List<Employee> employeeList, double minimumSalary){
        ArrayList<Employee> minimumEmployeeList = new ArrayList<>();

        for (Employee employee : employees){
            if (employee.salary() <= minimumSalary){
                minimumEmployeeList.add(employee);
            }
        }
        System.out.println(minimumEmployeeList);
    }

    public void calculateTotalSalary(List<Employee> employees){
        int totalSalary = 0;
        for (Employee employee : employees){
            totalSalary += employee.salary();
        }
        System.out.println("Total salary is : " + totalSalary);
    }

    public void displayEmployeeDetails(List<Employee> employees){
       for (Employee employee : employees){
           System.out.println(employee.toString());
       }
    }

    public void calculateAverageSalary(List<Employee> employees){
        double salaryAverage = 0;

        for (Employee employee : employees){
            salaryAverage += employee.salary();
        }

        System.out.println("Average salary is: " + (salaryAverage / employees.size()));
    }
}
