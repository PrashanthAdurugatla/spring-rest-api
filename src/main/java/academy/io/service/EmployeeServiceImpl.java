package academy.io.service;

import academy.io.entity.Employee;
import academy.io.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//@Component
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository repository;

    @Override
    public List<Employee> findAll() {
        return repository.findAll();
    }

    @Override
    public Employee findOne(String id) {
        Employee employee = repository.findOne(id);   //If user doesn't exists then it returns Null object

        if(employee == null){
            return null;
        }
        else{
            return employee;
        }
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
