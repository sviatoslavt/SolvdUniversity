package com.company;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(541,234,"Комп'ютерні науки","Денна","Державна основа",2);
        int submitted_works = student1.getSubmitted_works();


            if(submitted_works == 0 ){
                System.out.println("У студента: " + student1.getRecord_book_number() + " не атестація та здано: " + submitted_works + " робіт.");
            }
            else if(submitted_works == 2){
                System.out.println("У студента: " + student1.getRecord_book_number() + " оцінка: 3 та здано: " + submitted_works + " роботи.");
            }
            else if(submitted_works == 3){
                System.out.println("У студента: " + student1.getRecord_book_number() + " оцінка: 4 та здано: " + submitted_works + " роботи.");
            }
            else if(submitted_works >= 4){
                System.out.println("У студента: " + student1.getRecord_book_number() + " оцінка: 5 та здано: " + submitted_works + " робіт.");
            }

//зробити цей метод в Teacher

    }



}
