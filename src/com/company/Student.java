package com.company;

public class Student extends Person{
    private int group_number;
    private int record_book_number;
    private String specialty;
    private String form_of_education;
    private String basis; //платна чи державна форма навчання
    private int submitted_works;

//-----------------------------------------------------------------------------------

    public Student() {
    }

    public Student(int group_number,int record_book_number,String specialty, String form_of_education, String basis, int submitted_works) {
        this.group_number = group_number;
        this.record_book_number = record_book_number;
        this.specialty = specialty;
        this.form_of_education = form_of_education;
        this.basis = basis;
        this.submitted_works = submitted_works;
    }

//----------------------------------------------------------------------------------

    public void setGroup_number(int group_number){
        this.group_number = group_number;
    }
    public int getGroup_number() {
        return group_number;
    }

    public void setRecord_book_number(int record_book_number) {
        this.record_book_number = record_book_number;
    }
    public int getRecord_book_number() {
        return record_book_number;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    public String getSpecialty() {
        return specialty;
    }

    public void setForm_of_education(String form_of_education) {
        this.form_of_education = form_of_education;
    }
    public String getForm_of_education() {
        return form_of_education;
    }

    public void setBasis(String basis) {
        this.basis = basis;
    }
    public String getBasis() {
        return basis;
    }

    public void setSubmitted_works(int submitted_works) {
        this.submitted_works = submitted_works;
    }
    public int getSubmitted_works() {
        return submitted_works;
    }

    public String toString() {
        return "group number: " + group_number + "\n" +
                " record book number: " + record_book_number + "\n" +
                " specialty: " + specialty + "\n" +
                " form of education: " + form_of_education + "\n" +
                " basis: " + basis + "\n" +
                " submitted works: " + submitted_works;
    }
}
