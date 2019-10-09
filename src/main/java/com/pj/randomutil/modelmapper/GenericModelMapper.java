package com.pj.randomutil.modelmapper;

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

        System.out.printf("employeeDTOS: "+mapEmployees(employees,modelMapper));

        List<Project> projects = new ArrayList<>();
        projects.add(new Project("Project1", "DC", "jdoe@example.com", "2222"));
        projects.add(new Project("Project2", "NY", "tcruise@example.com", "434334"));

        System.out.printf("projectDTOS: "+mapProjects(projects,modelMapper));

    }

    private static String mapProjects(List<Project> projects, ModelMapper modelMapper)
    {
        Type type= new TypeToken<List<ProjectDTO>>() {}.getType();
        return modelMapper.map(projects,type);
    }

    private static List<EmployeeDTO> mapEmployees(List<Employee> employees, ModelMapper modelMapper)
    {
        Type type = new TypeToken<List<EmployeeDTO>>() {}.getType();
        return modelMapper.map(employees,type);
    }
}
