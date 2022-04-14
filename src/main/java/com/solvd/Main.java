package com.solvd;

public class Main {

    public static void main(String[] args) {

       Student student1 = new Student(541,234,"Computer science",
               "Full-time education","State basis",1,0);
       student1.checkSubmittedWorks();

       Teacher teacher1 = new Teacher("Mr. John", "Higher",
               "Teacher of mathematics", "Teacher", 10000, 2,
               0,"20/05/1995","+380951059488" );
       teacher1.checkBonus();

       Accountant accountant1 = new Accountant("Once a month","Higher",
               "Accounting activities","Accountant",15000,10,0,
               "Rosy Adamson", "08/01/1990","+380951111111");
       accountant1.stipendPayment();

    }
}
