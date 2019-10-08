package com.pj.randomutil;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class GenericModelMapper
{
    public static void main(String[] args)
    {
        ModelMapper modelMapper = new ModelMapper();
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", "Doe", "jdoe@example.com", "2222"));
        employees.add(new Employee("Tom", "Cruise", "tcruise@example.com", "434334"));

        Type type = new TypeToken<List<EmployeeDTO>>()
        {
        }.getType();

        List<EmployeeDTO> employeeDTOS=modelMapper.map(employees,type);
        System.out.printf("employeeDTOS: "+employeeDTOS.toString());
    }
}
