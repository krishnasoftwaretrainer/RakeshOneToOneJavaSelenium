package OOPS_Methods;

public class Constructors
{
    /*
    public Constructors(int a, int b)  //Patrameterized Constructor
    {
        int c = a + b;

        System.out.println("Addition is " + c);
    } */
    /*
    public  Constructors() //Normal Constructor
    {
        int a=20;
        int b=20;
        int c=a+b;
        System.out.println("Addition is "+c);
    }
*/

    {
        int a=20;
        int b=20;
        int c=a+b;
        System.out.println("Addition is "+c);
    }

    public static void main(String args[])
    {
       // Constructors con=new Constructors(20,30);  //Object Creation
            Constructors con=new Constructors();  //Object Creation
        //ClassName ObjectName=new ConstructorName();
        //Scanner sc=new Scanner(System.in);
    }
}
