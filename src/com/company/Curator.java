package com.company;

public class Curator extends Teacher{
    private int group_number;

//-----------------------------------------------------------------------------------

    public Curator() {
    }

    public Curator(int group_number) {
        this.group_number = group_number;

    }

//----------------------------------------------------------------------------------

    public void setGroup_number(int group_number){
        this.group_number = group_number;
    }
    public int getGroup_number() {
        return group_number;
    }

    public String toString() {
        return "group number: " + group_number ;
    }
}

