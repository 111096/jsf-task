
package com.jsftask.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "department")
public class Department {
 
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
 
    @NotNull
    @Size(min=2, max=30, message="Name must be between 2 and 30 letters")
    @Column(name = "name")
    String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "department", cascade = CascadeType.ALL)
    private List<Employee> employeeList;
}