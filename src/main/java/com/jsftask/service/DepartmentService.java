package com.jsftask.service;

import com.jsftask.model.Department;
import com.jsftask.dao.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepo;


    public List<Department> getAll() {
        return (List<Department>) departmentRepo.findAll();
    }

    public Department getDepartmentById(long id) {

        Department department = null;
        Optional<Department> searchEntity = departmentRepo.findById(id);
        if (searchEntity.isPresent())
            department = searchEntity.get();
        else
            throw new EntityNotFoundException();
        return department;
    }

    public void saveOrUpdate(Department department) {
        departmentRepo.save(department);
    }

    public void deleteDepartment(long id) {
        departmentRepo.deleteById(id);
    }


}