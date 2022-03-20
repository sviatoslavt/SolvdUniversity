package com.company;

public class Teacher extends WorkForce{
    private String subjects; //які предмети викладає
    private String department;

//-----------------------------------------------------------------------------------

    public Teacher() {
    }

    public Teacher(String subjects, String department) {
        this.subjects = subjects;
        this.department = department;

    }

//----------------------------------------------------------------------------------

    public void setSubjects(String subjects){
        this.subjects = subjects;
    }
    public String getSubjects() {
        return subjects;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }

    public String toString() {
        return "subjects: " + subjects + "\n" +
                " department: " + department + "\n";
    }

//----------------------------------------------------------------------------------



}
