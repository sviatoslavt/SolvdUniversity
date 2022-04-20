package com.solvd;

import com.solvd.Enums.Speciality;

public class Department {

    private String nameDepartment;
    private Speciality specialty;
    private int numberGroups;

    public Department() {
    }

    public Department(String nameDepartment, String specialty, int numberGroups) {
        this.nameDepartment = nameDepartment;
        this.specialty = Speciality.valueOf(specialty);
        this.numberGroups = numberGroups;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setSpecialty(Speciality specialty) {
        this.specialty = specialty;
    }

    public Speciality getSpecialty() {
        return specialty;
    }

    public void setNumberGroups(int numberGroups) {
        this.numberGroups = numberGroups;
    }

    public int getNumberGroups() {
        return numberGroups;
    }

    public String toString() {
        return "name of department: " + nameDepartment + "\n" +
                " specialty: " + specialty + "\n" +
                " number of groups: " + numberGroups;
    }
}
