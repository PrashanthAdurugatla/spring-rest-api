package academy.io.controller;

import academy.io.entity.Employee;
import academy.io.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


//@Controller
//@ResponseBody
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @RequestMapping(method = RequestMethod.GET, value = "/employees")
    public List<Employee> findAll(){
        return service.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/employees/{id}")
    public Employee findone(@PathVariable("id") String empId){
        return service.findOne(empId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/employees")
    public Employee create(@RequestBody Employee employee){
        return employee;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/employees/{id}")
    public Employee update(@PathVariable("id") String empId, @RequestBody Employee employee){
        return employee;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/employees/{id}")
    public void delete(@PathVariable("id") String empId){

    }
}
