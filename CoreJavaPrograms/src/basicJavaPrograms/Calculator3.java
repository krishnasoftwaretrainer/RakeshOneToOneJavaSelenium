package basicJavaPrograms;

import OOPS_Methods.*;

public class Calculator3
{
    //Different Package and Different Class Method Calling
    public  static     void main(String args[])
    {
        Calculator1 cal1=new Calculator1();  //Object Creation
        Calculator2 cal2=new Calculator2();  //Object Creation
        cal1.Addition();  //Same Package and Different Class Method Calling
       // Calculator1.Subtraction();
        //cal1.Multiplication();
        //Calculator1.Division();
        cal2.Modulus();
    }
}
