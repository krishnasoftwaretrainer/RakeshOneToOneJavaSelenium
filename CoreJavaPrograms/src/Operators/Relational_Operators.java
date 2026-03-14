package Operators;

public class Relational_Operators
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;

        System.out.println("a > b: " + (a > b)); // 10>20: false
        System.out.println("a < b: " + (a < b)); // 10<20: true
        System.out.println("a >= b: " + (a >= b)); // 10>=20: false
        System.out.println("a <= b: " + (a <= b)); // 10<=20: true
        System.out.println("a == b: " + (a == b)); // 10==20: false
        System.out.println("a != b: " + (a != b)); // 10!=20: true
    }
}
