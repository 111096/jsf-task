package com.jsftask.controller;

import com.jsftask.model.Department;
import com.jsftask.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named(value = "departmentController")
@ViewScoped
public class DepartmentController implements Serializable {


    private static final long serialVersionUID = 1L;

    @Autowired
    private DepartmentService departmentService;

    Department department = new Department();
    String name;
    List<Department> departmentList;

    public DepartmentController() {
    }

    @PostConstruct
    public void init() {
        departmentList = departmentService.getAll();

    }


    public String createDepartment() {

        this.department.setName(this.name);

        departmentService.saveOrUpdate(this.department);

        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();

        return "department.xhtml?faces-redirect=true";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartmentList() {
        return departmentService.getAll();
    }

    public void setDepartmentList(List<Department> departmentList) {
        this.departmentList = departmentList;
    }
}
