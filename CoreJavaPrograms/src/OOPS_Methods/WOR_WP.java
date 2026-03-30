package OOPS_Methods;

public class WOR_WP
{
    public void Addition1(int a,int b)  //Without Return Type and With Parameter Method
    {
        int c=a+b;
        System.out.println("Addition is "+c);
    }

    public static void main(String args[]) //Main Method
    {
        WOR_WP worp=new WOR_WP();  //ObjectCreation
        worp.Addition1(10,20);
        worp.Addition1(100,200);

         }
}
