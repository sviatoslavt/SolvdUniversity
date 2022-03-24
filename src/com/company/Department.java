package com.company;

public class Department {
    private String name_of_department;
    private String specialty;
    private int number_of_groups;

    public Department() {
    }

    public Department(String name_of_department, String specialty, int number_of_groups) {
        this.name_of_department = name_of_department;
        this.specialty = specialty;
        this.number_of_groups = number_of_groups;
    }

    public void setName_of_department(String name_of_department) {
        this.name_of_department = name_of_department;
    }

    public String getName_of_department() {
        return name_of_department;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setNumber_of_groups(int number_of_groups) {
        this.number_of_groups = number_of_groups;
    }

    public int getNumber_of_groups() {
        return number_of_groups;
    }

    public String toString() {
        return "name of department: " + name_of_department + "\n" +
                " specialty: " + specialty + "\n" +
                " number of groups: " + number_of_groups;
    }
}
