package io.sam.learning.springframework;

import io.sam.learning.springframework.config.ApplicationConfig;
import io.sam.learning.springframework.config.models.Employee;
import io.sam.learning.springframework.config.services.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Set;

public class LearningSpringFramework {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext (ApplicationConfig.class);
        System.out.println (context.getBean ("test"));
        EmployeeService employeeService = (EmployeeService) context.getBean ("employeeService");
        Set<Employee> employeeDetails = employeeService.getEmployeeDetails ( );
        employeeDetails.stream ( ).forEach (System.out::println);
    }

}
