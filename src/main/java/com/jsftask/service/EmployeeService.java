package com.jsftask.service;

import java.util.List;
import java.util.Optional;
 
import javax.persistence.EntityNotFoundException;

import com.jsftask.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.jsftask.dao.EmployeeRepository;
 
@Service
public class EmployeeService {
 
    @Autowired
    EmployeeRepository employeeRepo;
    
    
    public List<Employee> getAll() {
        return (List<Employee>) employeeRepo.findAll();
    }
 
    public Employee getEmployeeById(long id) {

        Employee employee = null;
        Optional<Employee> searchEntity = employeeRepo.findById(id);
        if (searchEntity.isPresent()) 
            employee = searchEntity.get();
         else 
             throw new EntityNotFoundException();
         return employee;
       }
       
       public void saveOrUpdate(Employee employee) {
          employeeRepo.save(employee);
       }
    
       public void deleteEmployee(long id) {
          employeeRepo.deleteById(id);
       }
    
  
}