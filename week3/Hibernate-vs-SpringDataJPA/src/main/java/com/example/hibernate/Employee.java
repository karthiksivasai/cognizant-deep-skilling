package com.example.hibernate;

public class Employee {
    private int id;
    private String name;
    private String department;

    public Employee() {}
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
} 