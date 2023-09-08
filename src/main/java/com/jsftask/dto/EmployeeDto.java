package com.jsftask.dto;

import com.jsftask.enums.GenderEnum;
import com.jsftask.model.Department;
import lombok.Data;


@Data
public class EmployeeDto {
    private Long Id;
    private String name;
    private GenderEnum gender;
    private Department department;
}
