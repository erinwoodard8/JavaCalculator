package com.tts;
import java.util.Scanner;

public class Main {


            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("hello from calculator");
                char again;
                do {
                    System.out.println("Enter your first number:");
                    float num1 = scanner.nextInt();
                    System.out.println("Enter your second number:");
                    float num2 = scanner.nextInt();
                    System.out.println("what method would you like to use ?");
                    System.out.println("[ a = Add, s = Subtract, m = Multiply, d = Divide]");



                    MagicCalculator cal1 = new MagicCalculator();
                    char choice = scanner.next().toLowerCase().charAt(0);
                    if (choice == 'a') {
                        System.out.println(num1 + " + " + num2 + " = " + cal1.add(num1, num2));
                    } else if (choice == 's') {
                        System.out.println(num1 + " - " + num2 + " = " + cal1.subtract(num1, num2));
                    } else if (choice == 'm') {
                        System.out.println(num1 + " x " + num2 + " = " + cal1.multiply(num1, num2));
                    } else if (choice == 'd') {
                        System.out.println(num1 + " / " + num2 + " = " + cal1.divide(num1, num2));
                    }
                    System.out.println("Do you want to use the calculator again?");
                    again = scanner.next().toLowerCase().charAt(0);
                } while (again == 'y');
                System.out.println("Thanks for using the Calculator ");
            }
        }




