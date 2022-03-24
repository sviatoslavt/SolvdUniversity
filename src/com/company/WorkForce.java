package com.company;

public class WorkForce extends Person{
    private String education;
    private String specialty;
    private String position;
    private int salary;

    public WorkForce() {
    }

    public WorkForce(String education, String specialty, String position, int salary) {
        this.education = education;
        this.specialty = specialty;
        this.position = position;
        this.salary = salary;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEducation() {
        return education;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return "education: " + education + "\n" +
                " specialty: " + specialty + "\n" +
                " position: " + position + "\n" +
                " salary: " + salary;
    }
}


