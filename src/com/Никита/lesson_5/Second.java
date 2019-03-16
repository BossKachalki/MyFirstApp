package com.Никита.lesson_5;

public class Second extends First {
    @Override
    public void doSomething() {
        System.out.println("Subhuman");
    }

    public void monteCarlo() {
        System.out.println("I think");
    }

    public void arello() {
        System.out.println("I mind");
    }

    public static void main(String[] args) {
        First first = new First();
        First f2 = new Second();
        Second second = new Second();
        first.jackIsBack();
        second.doSomething();
        f2.doSomething();
    }
}
