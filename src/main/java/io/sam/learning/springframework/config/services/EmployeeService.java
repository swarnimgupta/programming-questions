package io.sam.learning.springframework.config.services;

import io.sam.learning.springframework.config.models.Employee;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.TreeSet;

@Service("employeeService")
public class EmployeeService {

    public Set<Employee> getEmployeeDetails() {
        Set<Employee> employees = new TreeSet<> ( );
        employees.add (new Employee ("emp-101", "Swarnim Gupta", 1000000));
        employees.add (new Employee ("emp-102", "swarnim gupta", 1000000));
        return employees;
    }

}
