package academy.io.repository;

import academy.io.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
    @Override
    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Prashanth", "padurugatla9@gmail.com", 10000));
        employees.add(new Employee("Adurugatla", "prashantha9@gmail.com", 20000));

        return employees;

    }

    @Override
    public Employee findOne(String id) {
        Employee emp = new Employee("Adurugatla", "prashantha9@gmail.com", 20000);
        return emp;
    }
}
