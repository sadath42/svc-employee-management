package com.employee;

import java.util.ArrayList;

public class ParamsTest {

    public static void main(String[] args) {
        Employee e1 = new Employee(33);
        e1.setHobbies(new ArrayList<>());
        e1.getHobbies().add("reading");
        e1.getHobbies().add("writing");
        e1.setFirst_name("ram");
        e1.setLast_name("kapoor");
        e1.setSalary(20000);

        System.out.println("Before Change");
        System.out.println( "1--->"+e1.getFirst_name());
         var name = "Shyam";
        name =EmployeeUtility.changeName(e1);
        System.out.println("2----->"+e1.getFirst_name());
        System.out.println("3--->"+name);


    }
}
