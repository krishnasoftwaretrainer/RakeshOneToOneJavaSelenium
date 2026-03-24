package arrays_strings;

import java.util.Scanner;

public class OneDimensionArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //Static Array
        /*
        int htno[]={101,102,103,104,105,106};

        for(int i=0;i<htno.length;i++)
        {
            System.out.print(htno[i]+"  ");
        }*/
       //Dynamic Array
        //Memory Allocation
        //datatype[] arrayname=new datatype[size];
            int htno[]=new int[5];
            System.out.println("Enter the student htno:");

            for(int i=0;i<htno.length;i++)
            {
                htno[i]=sc.nextInt();
            }
            System.out.println("The student htno are:");
            for(int i=0;i<htno.length;i++)
            {
                System.out.print(htno[i]+"  ");
            }
    }
}
