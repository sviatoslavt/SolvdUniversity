package com.solvd;

public class University {

    private String universityName;
    private String addressUniversity;
    private int numberSpecialties;
    private int numberDepartments;

    public University() {
    }

    public University(String nameUniversity,String addressUniversity,int numberSpecialties, int numberDepartments) {

        this.universityName = nameUniversity;
        this.addressUniversity = addressUniversity;
        this.numberSpecialties = numberSpecialties;
        this.numberDepartments = numberDepartments;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setAddressUniversity(String addressUniversity) {
        this.addressUniversity = addressUniversity;
    }

    public String getAddressUniversity() {
        return addressUniversity;
    }

    public void setNumberSpecialties(int number_of_specialties) {
        this.numberSpecialties = number_of_specialties;
    }

    public int getNumberSpecialties() {
        return numberSpecialties;
    }

    public void setNumberDepartments(int numberDepartments) {
        this.numberDepartments = numberDepartments;
    }

    public int getNumberDepartments() {
        return numberDepartments;
    }

    public String toString() {
        return "name of university: " + universityName + "\n" +
                " address of university: " + addressUniversity + "\n" +
                " number of specialties: " + numberSpecialties + "\n" +
                " number of departments: " + numberDepartments;
    }
}
