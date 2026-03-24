package arrays_strings;

import java.util.Scanner;

public class MultiDimensionArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //First Array
        System.out.println("Enter the number of rows of First Array:");
        int r1=sc.nextInt();
        System.out.println("Enter the number of columns of First Array::");
        int c1=sc.nextInt();
        int a[][]=new int[r1][c1];  //3 rows and 3 columns

        System.out.println("Enter First Array Elements:");
        for(int i=0;i<a.length;i++)  //Rows
        {
            for(int j=0;j<a[i].length;j++) //a[0].length=3 a[1].length=3 a[2].length=3
            {
                a[i][j]=sc.nextInt();
            }
        }

        //Second Array
        System.out.println("Enter the number of rows of Second Array:");
        int r2=sc.nextInt();
        System.out.println("Enter the number of columns of Second Array::");
        int c2=sc.nextInt();
        int b[][]=new int[r2][c2];  //3 rows and 3 columns

        System.out.println("Enter Second Array Elements:");
        for(int i=0;i<b.length;i++)  //Rows
        {
            for(int j=0;j<b[i].length;j++) //a[0].length=3 a[1].length=3 a[2].length=3
            {
                b[i][j]=sc.nextInt();
            }
        }

        System.out.println("The first Array Elements are:");
        for(int i=0;i<a.length;i++)  //Rows
        {
            for(int j=0;j<a[i].length;j++) //a[0].length=3 a[1].length=3 a[2].length=3
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("The Second Array Elements are:");
        for(int i=0;i<b.length;i++)  //Rows
        {
            for(int j=0;j<b[i].length;j++)
            {
                System.out.print(b[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
