package academy.io.repository;

import academy.io.entity.Employee;

import java.util.List;

public interface EmployeeRepository {

    List<Employee> findAll();

    Employee findOne(String id);
}
