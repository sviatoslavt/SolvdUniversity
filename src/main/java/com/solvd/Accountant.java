package com.solvd;

import com.solvd.Interfaces.IStipend;

import org.apache.log4j.Logger;

public final class Accountant extends WorkForce implements IStipend {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

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
                "Full-time education","State basis",0,0);

        try {

        if (student.getSubmittedWorks() <= 3){
            student.setScholarship(0);
            LOGGER.info(getFullName() + " reports that " + "student: " + student.getRecordBook() + " doesn`t get a scholarship.");
        }
        else {
            student.setScholarship(1000);
            LOGGER.info(getFullName() + " reports that " + " student: " + student.getRecordBook() + " gets a scholarship in size: " + student.getScholarship());
        }
    }
        catch (Exception e) {
            LOGGER.info("Something went wrong");
        }
        return 0;
    }
}
