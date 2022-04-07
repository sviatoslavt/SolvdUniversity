package com.solvd;

public final class HeadDepartment extends WorkForce {

    private String department;

    public HeadDepartment() {
    }

    public HeadDepartment(String department) {
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
