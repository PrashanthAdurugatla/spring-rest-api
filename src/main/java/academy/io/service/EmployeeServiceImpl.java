package academy.io.service;

import academy.io.entity.Employee;
import academy.io.exception.BadRequestException;
import academy.io.exception.ResourceNotFoundException;
import academy.io.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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
        Employee existing = repository.findOne(id);   //If user doesn't exists then it returns Null object

        if(existing == null){
            throw new ResourceNotFoundException("Employee with id=" + id + "NOT FOUND");
        }
        else{
            return existing;
        }
    }

    @Override
    @Transactional
    public Employee create(Employee emp) {
        Employee existing = repository.findByEmail(emp.getEmail());
        if(existing != null){
            throw new BadRequestException("Employee with email " + emp.getEmail() + "already exists.") ;
        }
        return repository.create(emp);
    }

    @Override
    @Transactional
    public Employee update(String id, Employee emp) {
        Employee existing = repository.findOne(id);

        if(existing == null){
            throw new BadRequestException("Employee with id " + id + "doesn't exists.");
        }
        return repository.update(emp);
    }

    @Override
    @Transactional
    public void delete(String id) {
        Employee existing = repository.findOne(id);

        if(existing == null){
            throw new ResourceNotFoundException("Employee with id " + id + "doesn't exists.");
        }
        repository.delete(existing);

    }
}
