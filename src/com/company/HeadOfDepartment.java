package com.company;

public class HeadOfDepartment extends WorkForce{

    private String department;

    public HeadOfDepartment() {
    }

    public HeadOfDepartment(String department) {
        this.department = department;

    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String toString() {
        return "department: " + department;
    }
}
