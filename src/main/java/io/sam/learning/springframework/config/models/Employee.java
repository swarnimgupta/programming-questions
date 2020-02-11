package io.sam.learning.springframework.config.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private String id;
    private String employeeName;
    private Integer employeeSalary;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getId ( ).equalsIgnoreCase (employee.getId ( )) &&
                getEmployeeName ( ).equalsIgnoreCase (employee.getEmployeeName ( )) &&
                getEmployeeSalary ( ).equals (employee.getEmployeeSalary ( ));
    }

    @Override
    public int hashCode() {
        return Objects.hash (getId ( ), getEmployeeName ( ), getEmployeeSalary ( ));
    }

}
