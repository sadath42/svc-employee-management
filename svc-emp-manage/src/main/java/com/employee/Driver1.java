package com.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Driver1 {




    //Address ad=new Address("india","karnataka","mysore","Gandhi Nagar");


    public static void main(String[] args) {

        Employee e1 = new Employee(33);
        e1.setHobbies(new ArrayList<>());
        e1.getHobbies().add("reading");
        e1.getHobbies().add("writing");
        e1.setFirst_name("ram");
        e1.setLast_name("kapoor");
        e1.setSalary(20000);


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


        System.out.println(e1);
        System.out.println(e1.getHobbies());


        Employee e2 = new Employee(34);
        e2.setHobbies(new ArrayList<>());
        e2.getHobbies().add("reading");
        e2.getHobbies().add("writing");

        e2.setFirst_name("rahul");
        e2.setLast_name("sharma");

        e2.setSalary(40000);

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

        //System.out.println(e2);






      EmployeeUtility eu=new EmployeeUtility();
        Employee employee=eu.getHighestPaidEmployee(e1,e2);
        System.out.println(employee.getFirst_name());
        System.out.println(employee.getLast_name());
        System.out.println(employee.getAddress());
    }

    public  void  test2(){
        Employee e1 = new Employee(2);
        Employee e2 = new Employee(2);
        Employee e3 = new Employee(2);
        Employee e4 = new Employee(2);
        Employee e5 = new Employee(2);
        Employee e6 = new Employee(2);

        EmployeeUtility employeeUtility = new EmployeeUtility();
        Employee ex = employeeUtility.getHighestPaidEmployee(e1, e2);
        Employee ey = employeeUtility.getHighestPaidEmployee(e2, e3);
        Employee ez = employeeUtility.getHighestPaidEmployee(e4, e6);
        Employee ea = employeeUtility.getHighestPaidEmployee(e1, e1);

        System.out.println(ex.getFirst_name());
        System.out.println(ex.getLast_name());
        System.out.println(ex.getAddress());



    }
}
