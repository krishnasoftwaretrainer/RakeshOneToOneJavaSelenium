package Conditional_Statements;

public class Find_BiggestNum_TwoNumbers
{
    public static void main(String[] args)
    {
        int num1=20;
        int num2=20;

        if(num1>num2) //10>20 false 20>20  false
        {
            System.out.println("Num1 is biggest: " + num1); //Num1 is biggest: 10
        }
        else
        {
            System.out.println("Num2 is biggest: " + num2); //Num2 is biggest: 20
        }

    }
}
