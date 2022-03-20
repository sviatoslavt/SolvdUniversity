package com.company;

public abstract class Lesson {
    private String name_of_subject;
    private int lessons_per_week;
    private Teacher teacher;

//-----------------------------------------------------------------------------------

    public Lesson() {

    }

    public Lesson(String name_of_subject, int lessons_per_week, Teacher teacher) {
        this.name_of_subject = name_of_subject;
        this.lessons_per_week = lessons_per_week;
        this.teacher = teacher;
    }
//-----------------------------------------------------------------------------------

    public void setName_of_subject(String name_of_subject) {
        this.name_of_subject = name_of_subject;
    }
    public String getName_of_subject() {
        return name_of_subject;
    }

    public void setLessons_per_week(int lessons_per_week) {
        this.lessons_per_week = lessons_per_week;
    }
    public int getLessons_per_week() {
        return lessons_per_week;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public Teacher getTeacher() {
        return teacher;
    }

    public String toString() {
        return "name of subject: " + name_of_subject + "\n" +
                " lessons pre week: " + lessons_per_week + "\n" +
                " teacher: " + teacher;
    }
}
