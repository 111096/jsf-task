package com.jsftask.mapper;

import com.jsftask.dto.EmployeeDto;
import com.jsftask.model.Employee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public abstract class EmployeeMapper {

    public abstract Employee toEntity(EmployeeDto employeeDto);

    public abstract EmployeeDto toDto(Employee employee);

    public abstract List<EmployeeDto> toDtos(List<Employee> employee);
}
