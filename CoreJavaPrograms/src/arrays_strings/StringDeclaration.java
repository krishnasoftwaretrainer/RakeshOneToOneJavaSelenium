package arrays_strings;

import java.util.Scanner;

public class StringDeclaration
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //String Pool
        String name1="Ravi Kumar"; //String Literal->1001
        String name2="ravi Kumar"; //String Literal->1001
       // System.out.println(name1);
       // System.out.println(name2);

        //new keyword
        String name3=new String("Ravi Kumar"); //String Object 1003
        String name4=new String("ravi Kumar"); //String Object 1004
       // System.out.println(name3);
       // System.out.println(name4);

        System.out.println(name1==name2); //true
        System.out.println(name3==name4); //false

        System.out.println(name1.equals(name2)); //true
        System.out.println(name3.equals(name4)); //true

        System.out.println(name1.equalsIgnoreCase(name2)); //true
        System.out.println(name3.equalsIgnoreCase(name4)); //true

        System.out.println("Enter the String:");
       // String str=sc.nextLine();
            String str=sc.next(); //Ravi Kumar
        System.out.println("The String is:"+str);
    }
}
