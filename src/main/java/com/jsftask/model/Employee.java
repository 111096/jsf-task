
package com.jsftask.model;

import com.jsftask.enums.GenderEnum;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
 
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
 
    @NotNull
    @Size(min=2, max=30, message="Name must be between 2 and 30 letters")
    @Column(name = "name")
    String name;

    @Column(name = "gender", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private GenderEnum gender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", referencedColumnName = "ID")
    private Department department;
}