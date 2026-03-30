package OOPS_Methods;

public class WOR_WOP

{
    //Access specifier return type method name (parameters)
    public  void  Addition()  //User Define:Method or Function:Cal Non-Static Method
    {
        //Without Return Type and Without Parameter Method
        int a=20,b=20,c;
         c=a+b;
        System.out.println("Addition is "+c);
    }

    public static  void main(String args[]) //Main Method
    {
        //Cal
        WOR_WOP cal=new WOR_WOP();  //Object Creation
        cal.Addition(); //Method Calling Same Package and Same Class
    }
}
