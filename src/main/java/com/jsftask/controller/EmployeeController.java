package com.jsftask.controller;

import com.jsftask.model.Department;
import com.jsftask.enums.GenderEnum;
import com.jsftask.model.Employee;
import com.jsftask.service.DepartmentService;
import com.jsftask.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named(value = "employeeController")
@ViewScoped
public class EmployeeController implements Serializable {


    private static final long serialVersionUID = 1L;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentService departmentService;

    private List<Employee> employeeList;
    private List<Department> departmentList;

    private Employee employee = new Employee();

    private String name;
    private Integer gender;
    private Department department;

    public EmployeeController() {
    }


    @PostConstruct
    public void init() {
        employeeList = employeeService.getAll();
        departmentList = departmentService.getAll();
    }


    public void createEmployee() {

        this.employee.setName(this.name);
        this.employee.setGender(GenderEnum.findByGenderId(this.gender));
        this.employee.setDepartment(this.department);

        employeeService.saveOrUpdate(this.employee);

        employeeList.add(employee);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<Department> getDepartmentList() {
        return departmentList;
    }
}
