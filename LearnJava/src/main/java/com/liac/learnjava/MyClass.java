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

        System.out.println("Lesson 16: String variables and concatenation");
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

        System.out.println("Lesson 17: Integer variable type");
        int  age = 2000;
        int year = 1998;
        System.out.println("Hello, my name is " + characterName + " and I am " + age + " years old.");
        System.out.println("Java source file --> Compiler --> Bytecode (machine instructions) --> Device (with JVM) ");
        System.out.println("Compiler checks for syntax and errors.");
        System.out.println("JVM is Java Virtual Machine");
        System.out.println("The year is " + year);
        System.out.println("An int has a capacity of 32 bits");
        System.out.println("The int can hold ");

        System.out.println("Lesson 18: Java long, float, and double variable types");
        System.out.println("A long is twice as big as an int");
        System.out.println("A long holds 64 bits");
        long bigNumber = 1234567890123456789L;
        System.out.println("In Java, you have to specify a long with an 'L' after the number when it is declared");
        System.out.println("If you don't add the 'L' at the end of the number, Java will assume it is an int type");
        System.out.println("The long we declared as bigNumber is: " + bigNumber);
        System.out.println("This is done because Java does not want to reserve a huge storage space in case we only want to use a small number");
        float celsius = 45.9f;
        System.out.println("A float is a number with a decimal point and must be declared with an 'f' at the end");
        System.out.println("The value of our celsius float is: " + celsius);
        System.out.println("A double is more precise internally than a float");
        System.out.println("The capacity of a double is larger than a float");
        double height = 5.9;
        System.out.println("A double can be declared with a 'd' or without");
        System.out.println("All floating point types default to a double if they are not specified with an 'f' at the end");
        System.out.println("A float holds 32 bits, like an int");
        System.out.println("A double holds 64 bits, like a long");
        System.out.println("Doubles are used for more precision");
        System.out.println("");

        System.out.println("Lesson 19: Java byte and char variable types");
        System.out.println("");

    }
}