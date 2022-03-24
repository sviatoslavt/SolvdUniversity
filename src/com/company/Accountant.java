package com.company;

public class Accountant extends WorkForce{

    private String frequencyReporting;

    public Accountant() {
    }

    public Accountant(String frequencyReporting) {
        this.frequencyReporting = frequencyReporting;

    }

    public void setFrequencyReporting(String frequencyReporting) {
        this.frequencyReporting = frequencyReporting;
    }

    public String getFrequencyReporting() {
        return frequencyReporting;
    }

    public String toString() {
        return "frequency of reporting: " + frequencyReporting;
    }
}
