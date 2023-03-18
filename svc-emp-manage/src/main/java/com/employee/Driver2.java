package com.employee;

import java.util.ArrayList;
import java.util.List;

public class Driver2 {


    public static void main(String[] args) {
        Employee e1 = new Employee(33);
        e1.setFirst_name("ram");
        e1.setLast_name("kapoor");
        //e1.setHobbies("reading");
        e1.setSalary(100000);

        e1.getAddress();


        Address ad=new Address("india");
        ad.setStreet("gandhi lane");
        ad.setState("karnataka");
        ad.setDistrict("banglore");
        e1.setAddress(ad);

        Department dp=new Department(100);
        dp.setName("IT");
        dp.setMajor("sw");
        dp.setHod("jon");
        dp.setBonusFactor(0.5);
        e1.setDepartment(dp);

        Employee e2 = new Employee(34);


        e2.setFirst_name("rahul");
        e2.setLast_name("sharma");
        //e2.setHobbies("music");
        e2.setSalary(400000);

        Address ad2=new Address("india");
        ad2.setStreet("Nehru lane");
        ad2.setState("karnataka");
        ad2.setDistrict("mysore");
        e2.setAddress(ad2);

        Department dp2=new Department(100);
        dp2.setName("IT");
        dp2.setMajor("testing");
        dp2.setHod("peter");
        dp2.setBonusFactor(0.5);
        e2.setDepartment(dp2);


        Employee e3 = new Employee(33);
        e3.setFirst_name("mohan");
        e3.setLast_name("rao");
        //e3.setHobbies("reading");
        e3.setSalary(500000);

        Address ad3=new Address("india");
        ad3.setStreet("dyo lane");
        ad3.setState("karnataka");
        ad3.setDistrict("banglore");
        e3.setAddress(ad3);

        Department dp3=new Department(100);
        dp3.setName("IT");
        dp3.setMajor("sw");
        dp3.setHod("jon");
        dp3.setBonusFactor(0.5);
        e3.setDepartment(dp3);

        Employee e4 = new Employee(34);
        e4.setFirst_name("gagan");
        e4.setLast_name("raj");
        //e4.setHobbies("music");
        e4.setSalary(600000);

        Address ad4=new Address("india");
        ad4.setStreet("kodi lane");
        ad4.setState("AP");
        ad4.setDistrict("Vizak");
        e4.setAddress(ad4);

        Department dp4=new Department(100);
        dp4.setName("IT");
        dp4.setMajor("testing");
        dp4.setHod("peter");
        dp4.setBonusFactor(0.5);
        e4.setDepartment(dp4);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);


//printing highest paid employee
EmployeeUtility employeeUtility=new EmployeeUtility();
Employee ex=employees.get(0);
        for (int i = 1; i< employees.size() ; i++) {
                Employee ey=employees.get(i);
                ex= employeeUtility.getHighestPaidEmployee(ex,ey);
        }
        System.out.println(ex);
        }
    }
