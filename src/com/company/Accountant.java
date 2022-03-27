package com.company;

import com.company.Interfaces.Stipend;

public final class Accountant extends WorkForce implements Stipend {

    private String frequencyReporting;

    public Accountant() {
    }

    public Accountant(String frequencyReporting, String education, String specialty, String position,
                      int salary, int experience, int bonus, String fullName, String birthday, String phoneNumber) {
        super(education, specialty, position, salary, experience, bonus, fullName, birthday, phoneNumber);
        this.frequencyReporting = frequencyReporting;

    }

    public void setFrequencyReporting(String frequencyReporting) {
        this.frequencyReporting = frequencyReporting;
    }

    public String getFrequencyReporting() {
        return frequencyReporting;
    }

    public String toString() {
        return "frequency of reporting: " + frequencyReporting;
    }

    @Override
    public int stipendPayment() {
        Student student = new Student(541,234,"Computer science",
                "Full-time education","State basis",4,0);

        if (student.getSubmittedWorks() <= 3){
            student.setScholarship(0);
            System.out.println(getFullName() + " reports that " + "student: " + student.getRecordBook() + " doesn`t get a scholarship.");
        }
        else {
            student.setScholarship(1000);
            System.out.println(getFullName() + " reports that " + " student: " + student.getRecordBook() + " gets a scholarship in size: " + student.getScholarship());
        }
        return 0;
    }
}
