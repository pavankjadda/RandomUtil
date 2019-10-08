package com.pj.randomutil.modelmapper;

import lombok.Data;

@Data
public class Project
{
    private String name;
    private String location;
    private String manager;
    private String type;

    public Project(String name, String location, String manager, String type)
    {
        this.name = name;
        this.location = location;
        this.manager = manager;
        this.type = type;
    }
}
