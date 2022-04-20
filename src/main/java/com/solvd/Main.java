package com.solvd;

import org.apache.commons.lang3.RandomUtils;
import org.apache.log4j.Logger;

import com.solvd.Enums.Speciality;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        final Logger LOGGER = Logger.getLogger(Main.class);


        List<University> universities = new ArrayList<>(
                Arrays.asList(
                        new University("Yuri Fedkovych Chernivtsi National University",
                                "Kotsyubynskoho Street, 2",
                                5,5),
                        new University("Ivan Franko National University of Lviv",
                                "University Street, 1",
                                4,5)
                )
        );
        int randomWorks = RandomUtils.nextInt(0, 5);
        List<Student> students = new ArrayList<>(
                Arrays.asList(
                        new Student(541, 241, Speciality.COMPUTER_SCIENCE,
                                "Full-time education",
                                "State basis", randomWorks, 0),
                        new Student(541, 242, Speciality.COMPUTER_SCIENCE,
                                "Full-time education",
                                "State basis", randomWorks, 0),
                        new Student(541, 243, Speciality.COMPUTER_SCIENCE,
                                "Full-time education",
                                "State basis", randomWorks, 0)
                )
        );

        Student student1 = new Student(541,234,Speciality.COMPUTER_SCIENCE,
                "Full-time education","State basis",randomWorks,0);
        student1.checkSubmittedWorks();

        Teacher teacher1 = new Teacher("Mr. John", "Higher",
                "Teacher of mathematics", "Teacher", 10000, 2,
                0,"20/05/1995","+380951059488" );
        teacher1.checkBonus();

        Accountant accountant1 = new Accountant("Once a month","Higher",
                "Accounting activities","Accountant",15000,10,0,
                "Rosy Adamson", "08/01/1990","+380951111111");
        accountant1.stipendPayment();

        double numbOfSubmittedWorks = students.stream().filter(in -> (in instanceof Student))
                .mapToDouble(in -> ((Student) in).getSubmittedWorks()).sum();

        LOGGER.info("Number of submitted works: " + numbOfSubmittedWorks);

        students.forEach(item -> LOGGER.info(item.toString()));
        universities.forEach(item -> LOGGER.info(item.toString()));



    }
}
