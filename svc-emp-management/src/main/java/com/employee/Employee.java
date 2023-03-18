package com.employee;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    final int age;
    private String first_name;
    private String last_name;
    private List<String> hobbies;
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private Address address;
    private int salary;



    public String getFirst_name() {
        return first_name;
    }

    public int getAge() {
        return age;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }




    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(int age) {
        this.age = age;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                //", hobbies='" + hobbies + '\'' +
                ", department=" + department +
                ", address=" + address +
                ", salary=" + salary +
                '}';
    }
}