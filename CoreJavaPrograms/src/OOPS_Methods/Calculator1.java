package OOPS_Methods;  //Package Level

public class Calculator1  //+ - * / Class
{
    //Access specifier return type method name (parameters)
  public  void  Addition()  //User Define:Method or Function:Cal Non-Static Method
  {
      int a=20;
      int b=20;
      int c=a+b;
      System.out.println("Addition is "+c);
  }

  //Subtraction:Static Method
  public static void Subtraction()
  {
    int a=20;
    int b=20;
    int c=a-b;
    System.out.println("Subtraction is "+c);
  }

  //Multiplication:Non-Static Method
    public void Multiplication()
    {
        int a=20;
        int b=20;
        int c=a*b;
        System.out.println("Multiplication is "+c);
    }

    //Division:Static Method
    public static void Division()
    {
        int a=20;
        int b=20;
        int c=a/b;
        System.out.println("Division is "+c);
    }

  public static void main(String args[]) //Main Method
  {
      //Cal
      Calculator1 cal=new Calculator1();  //Object Creation
      cal.Addition(); //Method Calling
      Calculator1.Subtraction(); //Static Method Calling
      cal.Multiplication(); //Method Calling
      cal.Division(); //Static Method Calling
  }

}
