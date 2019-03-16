package com.Никита.lesson_4;

public class Person {

    private String name;
    private String gender;
    private int age;

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Error!");
        } else {
            this.name = name;
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.isEmpty()) {
            System.out.print("Error!");
        } else {
            this.gender = gender;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.print("Error");
        }
    }

    class Student extends Person {
        int weight;

        Student(String m, String s, int r, int c) {
            name = m;
            gender = s;
            age = r;
            weight = c;
        }


    }


}

