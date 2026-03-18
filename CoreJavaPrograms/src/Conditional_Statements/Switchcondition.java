package Conditional_Statements;

import java.util.Locale;
import java.util.Scanner;

public class Switchcondition
{
    public  static  void main(String args[])
    {
        //Calculator
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int a = scan.nextInt(); //20
        int b = scan.nextInt(); //30
        System.out.println("CALCULATOR");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");
       String choice = scan.next().toLowerCase();

        switch (choice)
        {
            case "addition":
            {
                int sum = a + b;
                System.out.println("Addition: " + sum);
                break;
            }
            case "subtraction":
            {
                int sub = a - b;
                System.out.println("Subtraction: " + sub);
                break;
            }
            case "multiplication":
            {
                int mul = a * b;
                System.out.println("Multiplication: " + mul);
                break;
            }
            case "division":
            {
                int div = a / b;
                System.out.println("Division: " + div);
                break;
            }
            default:
            {
                System.out.println("Invalid Choice");
            }
        }
        /*
        char choice = scan.next().charAt(0); //1

        switch (choice)
        {
            case '+':
            {
                int sum = a + b;
                System.out.println("Addition: " + sum);
                break;
            }
            case '-':
            {
                int sub = a - b;
                System.out.println("Subtraction: " + sub);
                break;
            }
            case '*':
            {
                int mul = a * b;
                System.out.println("Multiplication: " + mul);
                break;
            }
            case '/':
            {
                int div = a / b;
                System.out.println("Division: " + div);
                break;
            }
            default:
            {
                System.out.println("Invalid Choice");
            }
        }  */
        /*
        byte choice = scan.nextByte(); //1

        switch (choice)
        {
            case 1:
            {
                int sum = a + b;
                System.out.println("Addition: " + sum);
                break;
            }
            case 2:
            {
                int sub = a - b;
                System.out.println("Subtraction: " + sub);
                break;
            }
            case 3:
            {
                int mul = a * b;
                System.out.println("Multiplication: " + mul);
                break;
            }
            case 4:
            {
                int div = a / b;
                System.out.println("Division: " + div);
                break;
            }
             default:
             {
                 System.out.println("Invalid Choice");
             }
        } */
    }
}
