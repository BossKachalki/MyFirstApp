package com.Никита.lesson_3;

import java.sql.SQLOutput;
import java.util.Scanner;


public class work_1 {

    public static void main(String[] args) {

        System.out.println("Введите 4 числа: ");
        Scanner claptrap = new Scanner(System.in);
        int num1 = claptrap.nextInt();
        int num2 = claptrap.nextInt();
        int num3 = claptrap.nextInt();
        int num4 = claptrap.nextInt();
        if (num1 < num2 && num1 < num3 && num1 < num4) {
            System.out.println("Минимальное число: " + num1);
        }
        if (num2 < num1 && num2 < num3 && num2 < num4) {
            System.out.println("Минимальное число: " + num2);
        }
        if (num3 < num1 && num3 < num2 && num3 < num4) {
            System.out.println("Минимальное число: " + num3);
        }
        if (num4 < num1 && num4 < num2 && num4 < num3) {
            System.out.println("Минимальное число: " + num4);
        }
    }
}