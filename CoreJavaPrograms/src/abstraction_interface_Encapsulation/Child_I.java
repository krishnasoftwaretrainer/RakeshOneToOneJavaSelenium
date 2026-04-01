package abstraction_interface_Encapsulation;

interface Parent1
{
    void Father1();
}
interface Parent2
{
    void Father2();
}
public class Child_I implements Parent1,Parent2
{
    public void Father1()
    {
        System.out.println("Father Name: Ram");
    }
    public void Father2()
    {
        System.out.println("Father Name: Shyam");
    }
     public static void main(String[] args)
     {
         Child_I c=new Child_I();
         c.Father1();
         c.Father2();
     }
}
