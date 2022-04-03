package com.solvd;

import com.solvd.Interfaces.IBonus;

import org.apache.log4j.Logger;

public class Teacher extends WorkForce implements IBonus {

    Logger logger = Logger.getLogger(Main.class);

    private String subjects;
    private Department department;

    public Teacher() {
    }

    public Teacher(String fullName, String education, String specialty, String position, int salary,
                   int experience, int bonus, String birthday, String phoneNumber) {
        super(education, specialty, position, salary, experience, bonus, fullName, birthday, phoneNumber);
        this.subjects = subjects;
        this.department = department;

    }

    public void setSubjects(String subjects){
        this.subjects = subjects;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public String toString() {
        return "subjects: " + subjects + "\n" +
                " department: " + department + "\n";
    }

    @Override
    public void checkBonus() {

            if (this.getExperience() <= 4){
                this.setBonus(400);
                logger.info("Teacher: " + this.getFullName() + " in this year gets a bonus in size: " + getBonus());
            }
            else if (this.getExperience() >= 5){
                this.setBonus(1000);
                logger.info("Teacher: " + this.getFullName() + " in this year gets a bonus in size: " + getBonus());
            }
        }
}
