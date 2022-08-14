package com.example.cw6;

public class Students {

    private String name;
    private int age;
    private int grade;
    private int photo;

    public Students(String name, int age, int grade, int photo) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.photo = photo;
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
