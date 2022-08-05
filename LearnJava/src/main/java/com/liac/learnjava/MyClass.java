package com.liac.learnjava;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("Lessons 14 and 15: Java code structure");
        System.out.println("Hello Crunchy!");
        System.out.println("Hello Schwifty!");
        System.out.println("Hello Rutabaga!");
        System.out.println("Let's learn about Java code structure.");
        System.out.println("The package allows us to organize related classes in Java.");
        System.out.println("Classes are written in PascalCase in Java.");
        System.out.println("Parameters or arguments are passed inside of a method.");
        System.out.println("Strings DO NOT work inside single quotes in Java!");
        System.out.println("");

        System.out.println("Lesson 17: String variables and concatenation");
        String characterName = "Santa Clause";
        String nullName = null;
        String emptyName = "";

        System.out.println("Variables in Java must be declared with a type and a name");
        System.out.println("Variables should also be initialized");
        System.out.println("The most well known Christmas character is " + characterName + ".");
        System.out.println("A string can also be declared as " + nullName + " or empty " + emptyName + ".");
        System.out.println("A " + nullName + " value will print the word " + nullName + " when sent to the console.");
        System.out.println("An empty string is a variable, even though it is empty.");
        System.out.println("");

        System.out.println("Lesson 18: Integer variable type");
        int  age = 2000;
        int year = 1998;
        System.out.println("Hello, my name is " + characterName + " and I am " + age + " years old.");
        System.out.println("Java source file --> Compiler --> Bytecode (machine instructions) --> Device (with JVM) ");
        System.out.println("Compiler checks for syntax and errors.");
        System.out.println("JVM is Java Virtual Machine");
        System.out.println("The year is " + year);
        System.out.println("");

        System.out.println("Lesson 18: Java long and double variable types");

    }
}