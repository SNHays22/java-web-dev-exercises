package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private String topic;
    private ArrayList<Student> enrolledStudents;

    public Course(String topic, ArrayList<Student> enrolledStudents) {
        this.topic = topic;
        this.enrolledStudents = enrolledStudents;
    }
}

