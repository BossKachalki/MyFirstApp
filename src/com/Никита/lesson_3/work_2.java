package com.Никита.lesson_3;

import java.sql.SQLOutput;
import java.util.Scanner;


public class work_2 {

    public static void main(String[] args) {

        System.out.println("Введите число. Это номер месяца. А я определю время года, к которому он принадлежит.");
        Scanner claptrap = new Scanner(System.in);
        int MonthNumber = claptrap.nextInt();

        switch (MonthNumber) {
            case 1: System.out.println ("Зима"); break;
            case 2: System.out.println ("Зима"); break;
            case 3: System.out.println ("Весна"); break;
            case 4: System.out.println ("Весна"); break;
            case 5: System.out.println ("Весна"); break;
            case 6: System.out.println ("Лето"); break;
            case 7: System.out.println ("Лето"); break;
            case 8: System.out.println ("Лето"); break;
            case 9: System.out.println ("Осень"); break;
            case 10: System.out.println ("Осень"); break;
            case 11: System.out.println ("Осень"); break;
            case 12: System.out.println ("Зима"); break;

        }
    }
}