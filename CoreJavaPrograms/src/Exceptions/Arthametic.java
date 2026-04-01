package Exceptions;

public class Arthametic
{
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try {
            int c = a / b; //Unchecked Exception
            System.out.println(c);
            System.out.println("Division success");
        }
        catch (ArithmeticException e)
        {
            System.out.println("You cannot divide a number by zero");
        }

    }
}
