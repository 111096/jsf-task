package com.jsftask.dto;

import com.jsftask.model.Department;
import lombok.Data;

import java.util.List;

@Data
public class DepartmentDto {
    private Long Id;
    private String name;
    private List<Department> departmentList;
}
