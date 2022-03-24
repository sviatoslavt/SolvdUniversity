package com.company;

public abstract class University {
    private String nameUniversity;
    private String address_of_university;
    private int number_of_specialties;
    private int number_of_departments;

    public University() {
    }

    public University(String name_of_university,String address_of_university,int number_of_specialties, int number_of_departments) {
        this.nameUniversity = name_of_university;
        this.address_of_university = address_of_university;
        this.number_of_specialties = number_of_specialties;
        this.number_of_departments = number_of_departments;
    }

    public void setNameUniversity(String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }

    public String getNameUniversity() {
        return nameUniversity;
    }

    public void setAddress_of_university(String address_of_university) {
        this.address_of_university = address_of_university;
    }

    public String getAddress_of_university() {
        return address_of_university;
    }

    public void setNumber_of_specialties(int number_of_specialties) {
        this.number_of_specialties = number_of_specialties;
    }

    public int getNumber_of_specialties() {
        return number_of_specialties;
    }

    public void setNumber_of_departments(int number_of_departments) {
        this.number_of_departments = number_of_departments;
    }

    public int getNumber_of_departments() {
        return number_of_departments;
    }

    public String toString() {
        return "name of university: " + nameUniversity + "\n" +
                " address of university: " + address_of_university + "\n" +
                " number of specialties: " + number_of_specialties + "\n" +
                " number of departments: " + number_of_departments;
    }
}


