package com.Никита.lesson_5;

public class Third { //1)
    String name;     //4), 4.1)
    String weight;
    String walk;
    static String age;
    static String gender;
    static String eyes;

    public Third(){ //2)
    }
    static {                            //3)
        System.out.println("Машина");
    }
    static {
        System.out.println("Дорога");
    }
    {
        System.out.println("Привет");
    }
    {
        System.out.println("Скоро лето");
    }
    public static void main(String[] args){
        Third object = new Third();
        System.out.println(object.name);
        System.out.println(object.weight);
        System.out.println(object.age);
        System.out.println(object.gender);
    }
    {
        System.out.println(walk); //5)
        System.out.println(eyes);
    }

}
