package academy.io.service;

import academy.io.entity.Employee;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//@Component
@Service
public class EmployeeServiceImpl implements EmployeeService {

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

    @Override
    public Employee create(Employee emp) {
        return null;
    }

    @Override
    public Employee update(String id, Employee emp) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}
