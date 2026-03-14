package Operators;

public class Relational_Logical
{
    public static void main(String[] args)
    {
        int a = 10,b = 20,c = 30,d = 40;
        System.out.println((a>b) && (c>d));//false && false: false
        System.out.println((a>b) || (c>d));//false || false: false
          System.out.println((a<b) && (c>d)); //true && false: false
            System.out.println((a<b) || (c>d)); //true || false: true

        }
}
