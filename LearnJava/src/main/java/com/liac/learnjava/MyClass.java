package com.liac.learnjava;

public class MyClass {
    public static void main(String[] args) {
        String characterName = "Santa Clause";
        String nullName = null;
        String emptyName = "";

        System.out.println("Hello Crunchy!");
        System.out.println("Hello Schwifty!");
        System.out.println("Hello Rutabaga!");
        System.out.println("Let's learn about Java code structure.");
        System.out.println("The package allows us to organize related classes in Java.");
        System.out.println("Classes are written in PascalCase in Java.");
        System.out.println("Parameters or arguments are passed inside of a method.");
        System.out.println("Strings DO NOT work inside single quotes in Java!");
        System.out.println("");

        System.out.println("Lesson 17");
        System.out.println("Variables in Java must be declared with a type and a name");
        System.out.println("Variables should also be initialized");
        System.out.println("The most well known Christmas character is " + characterName + ".");
        System.out.println("A string can also be declared as " + nullName + " or empty " + emptyName + ".");
        System.out.println("A " + nullName + " value will print the word " + nullName + " when sent to the console.");
        System.out.println("An empty string is a variable, even though it is empty.");
        System.out.println("");

    }
}