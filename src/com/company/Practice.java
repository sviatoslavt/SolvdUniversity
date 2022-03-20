package com.company;

public class Practice extends Lesson{
    private String topic;
    private String task;
    private String required_time;

//-----------------------------------------------------------------------------------

    public Practice() {
    }

    public Practice(String topic,String task,String required_time) {
        this.topic = topic;
        this.task = task;
        this.required_time = required_time;
    }

//----------------------------------------------------------------------------------

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

    public void setRequired_time(String required_time) {
        this.required_time = required_time;
    }
    public String getRequired_time() {
        return required_time;
    }

    public String toString() {
        return "topic: " + topic + "\n" +
                " task: " + task + "\n" +
                " required time: " + required_time;
    }
}
