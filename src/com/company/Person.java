package com.company;

public abstract class Person {
    private String full_name;
    private String birthday;
    private String phone_number;


    public Person() {
    }

    public Person(String full_name, String birthday, String phone_number) {
        this.full_name = full_name;
        this.birthday = birthday;
        this.phone_number = phone_number;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String toString() {
        return "full name: " + full_name + "\n" +
                " birthday: " + birthday + "\n" +
                " phone_number: " + phone_number;
    }

}
