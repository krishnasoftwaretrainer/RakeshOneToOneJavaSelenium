package abstraction_interface_Encapsulation;

interface  RBI_Interface //Parent
{
    void loan();  //abstract method: No Implementation

}
public class ChildClass implements RBI_Interface
{
    public  void loan()
    {
        System.out.println("SBI Rat of Intrest:6%");
    }


}
