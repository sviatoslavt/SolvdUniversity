package com.solvd;

import com.solvd.Interfaces.IWorkCheck;

import org.apache.log4j.Logger;

public final class Student extends Person implements IWorkCheck {

    Logger logger = Logger.getLogger(Main.class);

    private int groupNumber;
    private int recordBook;
    private String specialty;
    private String formEducation;
    private String educationForm; //form of education
    private int submittedWorks;
    private int scholarship;

    public Student() {
    }

    public Student(int groupNumber,int recordBook,String specialty, String formEducation, String basis,
                   int submittedWorks, int scholarship) {
        this.groupNumber = groupNumber;
        this.recordBook = recordBook;
        this.specialty = specialty;
        this.formEducation = formEducation;
        this.educationForm = basis;
        this.submittedWorks = submittedWorks;
        this.scholarship = scholarship;
    }

    public void setGroupNumber(int groupNumber){
        this.groupNumber = groupNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setRecordBook(int recordBook) {
        this.recordBook = recordBook;
    }

    public int getRecordBook() {
        return recordBook;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setFormEducation(String formEducation) {
        this.formEducation = formEducation;
    }

    public String getFormEducation() {
        return formEducation;
    }

    public void setEducationForm(String educationForm) {
        this.educationForm = educationForm;
    }

    public String getEducationForm() {
        return educationForm;
    }

    public void setSubmittedWorks(int submittedWorks) {
        this.submittedWorks = submittedWorks;
    }

    public int getSubmittedWorks() {
        return submittedWorks;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    public int getScholarship() {
        return scholarship;
    }

    public String toString() {
        return "group number: " + groupNumber + "\n" +
                " record book number: " + recordBook + "\n" +
                " specialty: " + specialty + "\n" +
                " form of education: " + formEducation + "\n" +
                " basis: " + educationForm + "\n" +
                " submitted works: " + submittedWorks + "\n" +
                " scholarship: " + scholarship;
    }

    @Override
    public void checkSubmittedWorks() {

        try {
            switch (submittedWorks){
                case 1:
                    logger.info("The student: " + this.getRecordBook() + " not certified and passed: "
                            + submittedWorks + " works.");
                    break;

                case 2:
                    logger.info("The student: " + this.getRecordBook() + " rating: 3 and passed: "
                            + submittedWorks + " works.");
                    break;

                case 3:
                    logger.info("The student: " + this.getRecordBook() + " rating: 4 and passed: "
                            + submittedWorks + " works.");
                    break;

                case 4:
                    logger.info("The student: " + this.getRecordBook() + " rating: 4+ and passed: "
                            + submittedWorks + " works.");
                    break;

                default:
                    logger.info("The student: " + this.getRecordBook() + " rating: 5 and passed: "
                            + submittedWorks + " works.");
                    break;
            }
        }

        catch (Exception e) {
            logger.info("Something went wrong");
        }

    }
}
