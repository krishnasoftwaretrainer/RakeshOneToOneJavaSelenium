package abstraction_interface_Encapsulation;

public  abstract class RBI_Parent
{

    public abstract void loan();  //abstract method: No Implementation
//Un-Implemented method: No body Security
    public void BankTimings() //Normal Method Implementation
    {
        System.out.println("Bank Time:9 to 5pm");
    }



//Normal Class and Abstract Method: False
//Abstract Class and Normal Method: True
//Abstract Class and Abstract Method:True
//Abstract Class and Abstract Method and Normal Method:True
}