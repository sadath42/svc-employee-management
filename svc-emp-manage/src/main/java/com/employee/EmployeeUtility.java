package com.employee;

public class EmployeeUtility {
    public Employee getHighestPaidEmployee(Employee e1,Employee e2){

        //Department department=new Department(3);
        final var department = e1.getDepartment();
        final var department1 = e2.getDepartment();
        if( department.getDepartment_id() == department1.getDepartment_id()){
            if(e1.getSalary() > e2.getSalary()){
                return e1;
            }
            else {
                return e2;
            }
        }
        else {
            double salaryWithBonuse1=department.getBonusFactor()* e1.getSalary();
            double salaryWithBonuse2=department1.getBonusFactor()* e2.getSalary();
            if(salaryWithBonuse1 > salaryWithBonuse2){
                return e1;
            }
            else {
                return e2;
            }
        }

    }


    public static String changeName(String name,Employee e){
        System.out.println(name);
        e.setFirst_name(name);
        name ="changed";
        System.out.println(name);
        return name;
    }

    public static String changeName(Employee e){
        String name ="Not Changed";
        e= new Employee(2);
        e.setFirst_name(name);
        return name;
    }



}



