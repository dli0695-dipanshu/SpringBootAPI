package com.example.Day23.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public Long id;

    @Column(name = "firstname")
    public String firstname;

    @Column(name = "lastname")
    public String lastname;

    @Column(name = "email")
    public String email;

    @Column(name = "department")
    public String department;

    @Column(name = "salary")
    public Long salary;

    public Employee(){}

    public Employee(String firstname,String lastname,String email,String department,Long salary){

        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;
        this.department=department;
        this.salary=salary;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();

        builder.append(String.valueOf(id));
        builder.append(", ");
        builder.append(firstname);
        builder.append(" ");
        builder.append(lastname);
        builder.append(" ");
        builder.append(email);
        builder.append(" ");
        builder.append(department);
        builder.append(" ");
        builder.append(String.valueOf(salary));

        return builder.toString();
    }

}
