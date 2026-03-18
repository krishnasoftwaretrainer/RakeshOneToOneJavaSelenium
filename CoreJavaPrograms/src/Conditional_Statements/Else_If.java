package Conditional_Statements;

import java.util.Scanner;

public class Else_If {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter obtained marks: ");
        int obtainedMarks = scan.nextInt(); //85

        if (obtainedMarks >= 80 && obtainedMarks <= 100) //True  45>=35true 25>=35 false
        {                   //110>=80 true 110<=100 false:false
            System.out.println("Grade A+"); // Result: true Body TBS

        }  //exit
        else if (obtainedMarks >= 70 && obtainedMarks < 80) //110>=70 true 110<80 false:false
        {
            System.out.println("Grade A");
        } else if (obtainedMarks >= 60 && obtainedMarks < 70) {
            System.out.println("Grade B");
        } else if (obtainedMarks >= 50 && obtainedMarks < 60) {
            System.out.println("Grade C");
        } else if (obtainedMarks >= 35 && obtainedMarks < 50) {
            System.out.println("Grade D");
        } else if (obtainedMarks >= 0 && obtainedMarks < 35) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid Marks");
        }
    }
}