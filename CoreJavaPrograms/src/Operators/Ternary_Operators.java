package Operators;

import java.util.Scanner;

public class Ternary_Operators
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
            System.out.print("Enter obtained marks: ");
       int obtainedMarks = scan.nextInt(); //85
       // boolean result=obtainedMarks>=35?true:false;  //85>=35: true
        String result=obtainedMarks>=35?"Pass":"Fail";
       System.out.println("Result: " + result); // Result: true

         }
}
