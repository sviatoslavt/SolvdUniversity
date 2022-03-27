package com.company;

public abstract class Person {
    private String fullName;
    private String birthday;
    private String phoneNumber;


    public Person() {
    }

    public Person(String fullName, String birthday, String phoneNumber) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String toString() {
        return "full name: " + fullName + "\n" +
                " birthday: " + birthday + "\n" +
                " phone_number: " + phoneNumber;
    }

}
