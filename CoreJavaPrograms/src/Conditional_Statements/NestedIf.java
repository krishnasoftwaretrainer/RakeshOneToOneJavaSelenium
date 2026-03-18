package Conditional_Statements;

import java.util.Scanner;

public class NestedIf {
    //Biggest of three numbers  40 30 50    30 20 10   10 20 30
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any three numbers: ");
        int a = scan.nextInt(); //20
        int b = scan.nextInt(); //30
        int c = scan.nextInt(); //10

        if (a > b)//0 true 30>20 true 40>30 true 40 30 50 40>30 true
        {
            if (a > c)  //Inner If T  30>10 true 40>50 false 40>50 false
            {
                System.out.println("Biggest Number is: A=" + a); //Body of Inner If T
                //Body of Inner If T
            }
            else  //Inner Condition
            {
                System.out.println("Biggest Number is: C=" + c); //Body of Inner If F
            }
        }

            else if (b > c)  //True
            {
                System.out.println("Biggest Number is: B=" + b); //Body of Inner If F
            }
            else //Outer If F
            {
                System.out.println("Biggest Number is: C=" + c);
                //Body of Inner If F
            }
        }
    }


