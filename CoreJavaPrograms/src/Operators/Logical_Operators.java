package Operators;

public class Logical_Operators
{
    public static void main(String[] args)
    {
        boolean x = true;
        boolean y = true;  //Initialization
        y=false; //Re-Initialization
            x=false;
        System.out.println("x && y: " + (x&&y)); // true && true: true, false
        System.out.println("x || y: " + (x || y)); // true || true: true, true, false
        System.out.println("!x: " + (!x)); // !true: false, true
        System.out.println("!y: " + (!y)); // !true: false, true false
    }
}
