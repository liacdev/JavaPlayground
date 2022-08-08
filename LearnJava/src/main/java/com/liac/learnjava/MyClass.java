package com.liac.learnjava;

public class MyClass {
    public static void main(String[] args) {
/*
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

        System.out.println("Lesson 18: float, and double variable types");
        System.out.println("A long is twice as big as an int");
        System.out.println("A long holds 64 bits");
        long bigNumber = 1234567890123456789L;
        System.out.println("In Java, you have to specify a long with an 'L' after the number when it is declared");
        System.out.println("If you don't add the 'L' at the end of the number, Java will assume it is an int type");
        System.out.println("The long we declared as bigNumber is: " + bigNumber);
        System.out.println("This is done because Java does not want to reserve a huge storage space in case we only want to use a small number");
        System.out.println("");

        System.out.println("A float is a number with a decimal point and must be declared with an 'f' at the end");
        System.out.println("A float holds 32 bits, like an int");
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("The minimum value for a float is " + minFloat + " and the maximum value for a float is " + maxFloat);
        System.out.println("");

        System.out.println("A double holds 64 bits, like a long");
        System.out.println("The capacity of a double is larger than a float");
        System.out.println("A double is more precise internally than a float");
        System.out.println("A double can be declared with a 'd' or without");
        System.out.println("All floating point types default to a double if they are not specified with an 'f' at the end");
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("The minimum value for a double is " + minDouble + " and the maximum value for a double is " + maxDouble);
        System.out.println("");

        System.out.println("Lesson 19: Java byte and char variable types");
        System.out.println("An int is a whole number that holds 32 bits");
        System.out.println("");

        System.out.println("A byte holds 8 bits of data");
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("The minimum value for a byte is " + minByte + " and the maximum value for a byte is " + maxByte);
        System.out.println("");

        System.out.println("A short holds 2 bytes of data (16 bits)");
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("The minimum value for a short is " + minShort + " and the maximum value for a short is " + maxShort);
        System.out.println("");

        System.out.println("An int holds four bytes (32 bits)");
        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;;
        System.out.println("The minimum value for an int is " + minInt + " and the maximum value for an int is " + maxInt);
        System.out.println("");

        System.out.println("A char holds two bytes (16 bits) and is used to hold only one character");
        char charC = 'C';
        char charH = 'h';
        char charA = 'a';
        char charR = 'r';

        System.out.println(charC);
        System.out.println(charH);
        System.out.println(charA);
        System.out.println(charR);
        System.out.println("");

        System.out.println(charC + charH + charA + charR);
        System.out.println("charC + charH + charA + charR");
        System.out.println("");

        char minChar = Character.MIN_VALUE;
        char maxChar = Character.MAX_VALUE;
        System.out.println("The minimum value for a char is " + minChar + " and the maximum value for a char is " + maxChar);
        System.out.println("");

        System.out.println("Lesson 20: Java boolean variable type");
        System.out.println("The boolean type is used for true and false values");
        boolean boolA = true;
        boolean boolB = false;
        System.out.println("The output of a boolean is either " + boolA + " or " + boolB);
        System.out.println("");

        System.out.println("Boolean variable names are often written to indicate whether something is or true or not true");
        boolean isTall = true;
        boolean isTouchingGround = false;
        boolean canDoubleJump = true;
        boolean canFly = false;

        System.out.println("isTall = " + isTall);
        System.out.println("isTouchingGround = " + isTouchingGround);
        System.out.println("canDoubleJump = " + canDoubleJump);
        System.out.println("canFly = " + canFly);
        System.out.println("");

        // These will throw errors at compilation time
        // boolean boolC = 0;
        // boolean boolD = 1;
        System.out.println("");

        System.out.println("The boolean data type does not have a minimum or maximum value, as shown");
        // boolean minBoolean = Boolean.MIN_VALUE;
        // boolean maxBoolean = Boolean.MAX_VALUE;
        System.out.println("");


 */
        System.out.println("Lesson 21: Java Operators ");
        System.out.println("The simple assignment operator is the '=' equals sign");
        System.out.println("It is used to assign the value on the right side to the variable on the left side");
        int a = 20;
        int b = 30;
        System.out.println("We can print the contents of these variables");
        System.out.println("");
        System.out.println("The value of 'a' is " + a + " and the value of 'b' is " + b);
        System.out.println("");

        System.out.println("The addition operator is used to add two or more numbers together");
        System.out.println("The result can be stored in a variable");
        int sum = a + b;
        System.out.println("The sum of a + b is " + sum);
        int c = 50;
        System.out.println("A variable can be changed by reassigning the value");
        System.out.println("We don't need to specify the type when we reuse a variable");
        sum = a + b + c;
        System.out.println("The sum of a + b + c is " + sum);
        System.out.println("Finally, concatenation means adding strings with other strings and variables");
        System.out.println();
        System.out.println("The sum of " + a + " + " + b + " + " + c + " is " + sum);
        System.out.println("");

        System.out.println("The subtraction operator will return the difference of two numbers");
        int difference = sum - c;
        System.out.println("The difference of sum - c = " + difference);
        System.out.println("");

        System.out.println("Can we subtract more than one number?  Let's find out.");
        difference = sum - c - b;
        System.out.println("The difference of sum - c - b = " + difference);
        System.out.println("We could also write " + sum + " - " + c + " - " + b + " = " + difference);
        System.out.println("");

        System.out.println("Java will also allow us to subtract a larger number from a smaller number to result in a negative difference");
        difference = a - c;
        System.out.println("a - c = " + difference);
        System.out.println("");

        System.out.println("Multiplication");
        System.out.println("");


    }
}