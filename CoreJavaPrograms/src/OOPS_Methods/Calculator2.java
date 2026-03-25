package OOPS_Methods;

public class Calculator2 //+ - * / % Class
{
    public void Modulus() //Non-Static Method
    {
        int a=10;
        int b=20;
        int c=a%b;
        System.out.println("Modulus is "+c);
    }
    public  static  void main(String args[])
    {
        Calculator1 cal1=new Calculator1();  //Object Creation
        cal1.Addition();
        Calculator1.Subtraction();
        cal1.Multiplication();
        Calculator1.Division();
        Calculator2 cal2=new Calculator2();  //Object Creation
        cal2.Modulus();
    }

}
