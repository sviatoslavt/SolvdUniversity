package com.solvd;

public abstract class Lesson {

    private String nameSubject;
    private int lessonsPerWeek;
    private Teacher teacher;

    public Lesson() {

    }

    public Lesson(String nameSubject, int lessonsPerWeek, Teacher teacher) {
        this.nameSubject = nameSubject;
        this.lessonsPerWeek = lessonsPerWeek;
        this.teacher = teacher;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setLessonsPerWeek(int lessonsPerWeek) {
        this.lessonsPerWeek = lessonsPerWeek;
    }

    public int getLessonsPerWeek() {
        return lessonsPerWeek;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String toString() {
        return "name of subject: " + nameSubject + "\n" +
                " lessons pre week: " + lessonsPerWeek + "\n" +
                " teacher: " + teacher;
    }
}
