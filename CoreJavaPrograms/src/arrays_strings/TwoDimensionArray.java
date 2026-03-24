package arrays_strings;

import java.util.Scanner;

public class TwoDimensionArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
      //Static 2D Array
        /*
        int a[][]={{10,20,30,11},{40,50,60,12},{70,80,90,13}};  //3x3=9

        for(int i=0;i<a.length;i++)  //Rows
        {
            for(int j=0;j<a[i].length;j++) //a[0].length=3 a[1].length=3 a[2].length=3
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();

         */
        //Dynamic 2D Array
        System.out.println("Enter the number of rows:");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int c=sc.nextInt();
        int a[][]=new int[r][c];  //3 rows and 3 columns

        System.out.println("Enter Array Elements:");
        for(int i=0;i<a.length;i++)  //Rows
        {
            for(int j=0;j<a[i].length;j++) //a[0].length=3 a[1].length=3 a[2].length=3
            {
                a[i][j]=sc.nextInt();
            }
         }
            System.out.println("The Array Elements are:");
            for(int i=0;i<a.length;i++)  //Rows
            {
                for(int j=0;j<a[i].length;j++) //a[0].length=3 a[1].length=3 a[2].length=3
                {
                    System.out.print(a[i][j]+"  ");
                }
                System.out.println();
        }
    }
}
