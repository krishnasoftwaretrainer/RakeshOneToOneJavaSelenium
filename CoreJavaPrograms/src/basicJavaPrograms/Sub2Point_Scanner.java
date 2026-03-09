package basicJavaPrograms;

import java.util.Scanner;

public class Sub2Point_Scanner {
    public  static  void  main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter First Value:");
        float a=scan.nextFloat();
        System.out.println("Enter Second Value:");
        float b=scan.nextFloat();
        float sum=a+b;
        System.out.println("Sum:"+sum);

    }
}
