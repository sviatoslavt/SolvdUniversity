package com.solvd;

public final class Curator extends Teacher {

    private int groupNumber;

    public Curator() {
    }

    public Curator(int groupNumber) {

        this.groupNumber = groupNumber;

    }

    public void setGroupNumber(int groupNumber){
        this.groupNumber = groupNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public String toString() {
        return "group number: " + groupNumber;
    }
}
