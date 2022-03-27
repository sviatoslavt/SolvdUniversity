package com.company;

public final class Practice extends Lesson{
    private String topic;
    private String task;
    private String requiredTime;

    public Practice() {
    }

    public Practice(String topic,String task,String requiredTime) {
        this.topic = topic;
        this.task = task;
        this.requiredTime = requiredTime;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
    public String getTopic() {
        return topic;
    }

    public void setTask(String task) {
        this.task = task;
    }
    public String getTask() {
        return task;
    }

    public void setRequiredTime(String requiredTime) {
        this.requiredTime = requiredTime;
    }
    public String getRequiredTime() {
        return requiredTime;
    }

    public String toString() {
        return "topic: " + topic + "\n" +
                " task: " + task + "\n" +
                " required time: " + requiredTime;
    }
}
