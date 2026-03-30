package OOPS_Methods;

public class WR_WP
{
    public  int Addition(int a,int b)  //User Define:Method or Function:Cal Non-Static Method
    {
        //Without Return Type and With Parameter Method
        int c=a+b;
        return c; //Return Statement
    }

       public static  void main(String args[]) //Main Method
       {
           //Cal
           WR_WP cal=new WR_WP();  //Object Creation
          // cal.Addition(); //Method Calling Same Package and Same Class
           int result=cal.Addition(100,20); //Method Calling and Store in Variable
           System.out.println("Addition     is "+result);
       }
}
