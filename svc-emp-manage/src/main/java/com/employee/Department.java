package com.employee;

public class Department {
    final int department_id;
     private String name;
    private String major;
    private String hod;
    private double BonusFactor;

    public Department(int departmentId) {
        department_id = departmentId;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getHod() {
        return hod;
    }

    public void setHod(String hod) {
        this.hod = hod;
    }

    public double getBonusFactor() {
        return BonusFactor;
    }

    public void setBonusFactor(double bonusFactor) {
        BonusFactor = bonusFactor;
    }

    @Override
    public String toString() {
        return "Department{" +
                "department_id=" + department_id +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", hod='" + hod + '\'' +
                ", BonusFactor=" + BonusFactor +
                '}';
    }
}
