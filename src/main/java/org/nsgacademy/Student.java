package org.nsgacademy;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;

    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
