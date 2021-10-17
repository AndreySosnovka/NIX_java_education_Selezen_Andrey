import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        int age;
        System.out.println("Hello! My name is Jon");
        System.out.println("I was created in 2021");


        Scanner scanner = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);


        System.out.println("Please, remind me your name.");
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name);


        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int valueFirst = scannerInt.nextInt();
        int valueSecond = scannerInt.nextInt();
        int valueThird = scannerInt.nextInt();
        age = (valueFirst * 70 + valueSecond * 21 + valueThird * 15) % 105;
        System.out.println("Your age is " + age + " that's a good time to start programming!");


        System.out.println("Now I will prove to you that I can count to any number you want.");
        int value = scannerInt.nextInt();
        for(int i = 0; i <= value; i++) {
            System.out.println(i +"!");
        }
        System.out.println("Lets test your programming knowledge.");
        System.out.println("Choose one of the correct options.");
        System.out.println("What is OutOfMemoryError?");
        System.out.println("1.  Protocol error");
        System.out.println("2.  Variable name");
        System.out.println("3.  Is a runtime error in Java which occurs when the Java Virtual Machine is unable to allocate an object due to insufficient space in the Java heap");
        System.out.println("4.  This is the name of the city.");
        int choose = scannerInt.nextInt();
        switch (choose){
            case 1:
                System.out.println("Please, try again.");
                break;
            case 2:
                System.out.println("Please, try again.");
                break;
            case 3:
                System.out.println("Great, you right!");
                break;
            case 4:
                System.out.println("Please, try again.");
                break;
        }
        System.out.println("Goodbye, have a nice day!");
    }
}
