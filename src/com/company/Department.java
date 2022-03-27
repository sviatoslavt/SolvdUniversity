package com.company;
import com.company.Enums.Specialty;

public class Department {
    private String nameDepartment;
    private Specialty specialty;
    private int numberGroups;

    public Department() {
    }

    public Department(String nameDepartment, String specialty, int numberGroups) {
        this.nameDepartment = nameDepartment;
        this.specialty = Specialty.valueOf(specialty);
        this.numberGroups = numberGroups;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setSpecialty(String specialty) {
        this.specialty = Specialty.valueOf(specialty);
    }

    public String getSpecialty() {
        return String.valueOf(specialty);
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
