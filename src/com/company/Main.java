package com.company;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(541,234,"Computer science","Full-time education","State basis",2);
        int submitted_works = student1.getSubmitted_works();


            if(submitted_works == 0 ){
                System.out.println("The student: " + student1.getRecord_book_number() + " not certified and passed: " + submitted_works + " works.");
            }
            else if(submitted_works == 2){
                System.out.println("The student: " + student1.getRecord_book_number() + " rating: 3 and passed: " + submitted_works + " works.");
            }
            else if(submitted_works == 3){
                System.out.println("The student: " + student1.getRecord_book_number() + " rating: 4 and passed: " + submitted_works + " works.");
            }
            else if(submitted_works >= 4){
                System.out.println("The student: " + student1.getRecord_book_number() + " rating: 5 and passed: " + submitted_works + " works.");
            }
    }
}
