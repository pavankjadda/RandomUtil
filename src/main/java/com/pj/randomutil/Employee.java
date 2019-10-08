package com.pj.randomutil;

import lombok.Data;

@Data
class Employee
{
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    Employee(String firstName, String lastName, String email, String phone)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.phone=phone;
    }
}
