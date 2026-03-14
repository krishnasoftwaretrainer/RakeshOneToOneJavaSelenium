package Operators;

public class Unary_Operators
{
    public static void main(String[] args)
    {
        /*
        int a = 10,b=10,c=10,d=10;
        System.out.println(++a); //11
        System.out.println(b++); //10
        System.out.println("b:"+b); //11
        System.out.println(--c); //9
        System.out.println(d--); //10
        System.out.println("d:"+d); //9  */

        int x=10;
        System.out.println(x); //10
        System.out.println(++x); //Print:11 Update:11 x=11
            System.out.println(x++); //Print:11 Update:12 x=12
            System.out.println(--x); //Print:11 Update:11 x=11
            System.out.println(x--); //Print:11 Update:10 x=10
             System.out.println(x); //10

          }
}
