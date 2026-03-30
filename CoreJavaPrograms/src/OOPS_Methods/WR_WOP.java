package OOPS_Methods;

public class WR_WOP
 {
     public  int Addition()  //User Define:Method or Function:Cal Non-Static Method
     {
         //Without Return Type and Without Parameter Method
         int a=20,b=20,c;
          c=a+b;
          return c; //Return Statement
     }

        public static  void main(String args[]) //Main Method
        {
            //Cal
            WR_WOP cal=new WR_WOP();  //Object Creation
           // cal.Addition(); //Method Calling Same Package and Same Class
            int result=cal.Addition(); //Method Calling and Store in Variable
            System.out.println("Addition     is "+result);
        }

}
