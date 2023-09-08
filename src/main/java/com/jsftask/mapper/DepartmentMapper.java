package com.jsftask.mapper;

import com.jsftask.model.Department;
import com.jsftask.dto.DepartmentDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = EmployeeMapper.class)
public abstract class DepartmentMapper {

    public abstract Department toEntity(DepartmentDto departmentDto);

    public abstract DepartmentDto toDto(Department department);

    public abstract List<DepartmentDto> toDtos(List<Department> department);
}
