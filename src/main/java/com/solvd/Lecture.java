package com.solvd;

public final class Lecture extends Lesson {

    private String topic;
    private String requiredTime;

    public Lecture() {

    }

    public Lecture(String topic,String requiredTime) {
        this.topic = topic;
        this.requiredTime = requiredTime;

    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setRequiredTime(String requiredTime) {
        this.requiredTime = requiredTime;
    }

    public String getRequiredTime() {
        return requiredTime;
    }

    public String toString() {
        return "topic: " + topic + "\n" +
                " required time: " + requiredTime;
    }
}
