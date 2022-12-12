package com.codekul.Spring6DecBatch.jdbctemplate.controller;

import com.codekul.Spring6DecBatch.jdbctemplate.dao.EmployeeDao;
import com.codekul.Spring6DecBatch.jdbctemplate.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @PostMapping("/saveEmployee")
    public String saveEmployee(@RequestBody Employee employee){
       String msg = employeeDao.save(employee);
       return msg;
    }

    @GetMapping("/findAll")
    public List<Employee> getAllEmployee(){
        return employeeDao.findAll();
    }

    @GetMapping("/findById/{userId}")
    public Employee findById(@PathVariable("userId") Long userId1){
        return employeeDao.findById(userId1);
    }

    @GetMapping("/findByName")
    public  List<Employee>  findByName(@RequestParam String name,
                               @RequestParam(required = false) String department){
        return employeeDao.findByName(name,department);
    }

    @PutMapping("/updateEmployee/{empId}")
    public String update(@RequestBody Employee employee,@PathVariable Long empId){
        employeeDao.update(empId,employee);
        return "Record updated successfully";
    }

    @DeleteMapping("/delete/{empId}")
    public String delete(@PathVariable Long empId){
        employeeDao.deleteById(empId);
        return "Record deleted successfully";
    }
}

