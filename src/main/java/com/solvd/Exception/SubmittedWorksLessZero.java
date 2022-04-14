package com.solvd.Exception;

public class SubmittedWorksLessZero extends Exception{

    public SubmittedWorksLessZero(){
        super("Submitted works cannot be less than 0");
    }

}
