package com.Никита.lesson_5;

public class Fourth extends Third { //1)
    String race;                    //4), 4.1)
    String humanity;
    String face;
    static String education;
    static String work;
    static String length;

    public Fourth(){ //2)
    }
    static {                                                                //3)
        System.out.println("Объект ещё не создан, но статический блок " +
                "уже выполняется.");
    }
    static {
        System.out.println("Время запуска программы: ");
    }
    {
        System.out.println("Обьект,");
    }
    {
        System. out.println("Здравствуйте");
    }
    {
        System.out.println(face); //5)
        System.out.println(length);
    }
    public static void main(String[] args){
        Fourth scale = new Fourth();
        System.out.println(scale.race);
        System.out.println(scale.humanity);
        System.out.println(scale.education);
        System.out.println(scale.work);
        Third female = new Third();
        Fourth male = new Fourth();
    }
}