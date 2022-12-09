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

//    @GetMapping("/findAll")
//    public List<Employee> getAllEmployee(){
//        return employeeDao.findAll();
//    }
//
//    @GetMapping("/findById/{userId}")
//    public Employee findById(@PathVariable Long userId){
//        return employeeDao.findById(userId);
//    }
//    @PutMapping("/updateEmployee/{usedId}")
//    public String update(@RequestBody Employee employee,@PathVariable Long usedId){
//        employeeDao.update(usedId,employee);
//        return "Record updated successfully";
//    }
//    @DeleteMapping("/delete/{userId}")
//    public String delete(@PathVariable Long userId){
//        employeeDao.deleteById(userId);
//        return "Record deleted successfully";
//    }
}

