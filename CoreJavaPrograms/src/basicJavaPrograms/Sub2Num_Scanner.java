package basicJavaPrograms;
import java.util.Scanner;

public class Sub2Num_Scanner  //User-Define
{
    public  static  void  main(String args[])
    {
       Scanner scan=new Scanner(System.in);
        System.out.println("Enter First Value:");
        int a=scan.nextInt();
        System.out.println("Enter Second Value:");
       int b=scan.nextInt();
       int sum=a+b;
       System.out.println("Sum:"+sum);

    }
}
