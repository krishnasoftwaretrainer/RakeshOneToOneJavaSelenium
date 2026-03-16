package Conditional_Statements;

import java.util.Scanner;

public class SimpleIf
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter obtained marks: ");
        int obtainedMarks = scan.nextInt(); //85

        if(obtainedMarks>=35) //True  45>=35true 25>=35 false
        {
            System.out.println("Pass"); // Result: true Body TBS

        }  //exit

        //Null Empty Blank



    }
}
