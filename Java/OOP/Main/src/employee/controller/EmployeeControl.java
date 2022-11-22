package employee.controller;

import employee.model.Employee;

import java.util.List;

public class EmployeeControl {
    public List<Employee> employeeList;

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }
    public void removeEmployee(long id) {
        employeeList.removeIf(item -> item.getId() == id);
    }

    public Employee findEmployee(long id) {
        Employee temp = null;
        for (Employee employee : employeeList) {
            temp = employee.getId() == id ? employee : null;
        }
        return temp;
    }
}
