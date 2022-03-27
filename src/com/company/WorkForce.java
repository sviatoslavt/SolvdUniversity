package com.company;

public abstract class WorkForce extends Person{
    private String education;
    private String specialty;
    private String position;
    private int salary;
    private int experience;
    private int bonus;

    public WorkForce() {
    }

    public WorkForce(String education, String specialty, String position, int salary, int experience, int bonus,
                     String fullName, String birthday, String phoneNumber) {
        super(fullName, birthday, phoneNumber);
        this.education = education;
        this.specialty = specialty;
        this.position = position;
        this.salary = salary;
        this.experience = experience;
        this.bonus = bonus;
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

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public String toString() {
        return "education: " + education + "\n" +
                " specialty: " + specialty + "\n" +
                " position: " + position + "\n" +
                " salary: " + salary;
    }
}
