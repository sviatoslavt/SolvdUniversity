package com.company;

public class Lecture extends Lesson {
    private String topic;
    private String required_time;

    public Lecture() {
    }

    public Lecture(String topic,String required_time) {
        this.topic = topic;
        this.required_time = required_time;

    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setRequired_time(String required_time) {
        this.required_time = required_time;
    }

    public String getRequired_time() {
        return required_time;
    }

    public String toString() {
        return "topic: " + topic + "\n" +
                " required time: " + required_time;
    }
}
