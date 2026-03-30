package Inheritence;

public class SingleLevel_Inheritance_Child extends SingleLevel_Inheritance_Parent
{
    public void Son()
    {
        System.out.println("This is Son");
    }

    public static void main(String[] args)
    {
        SingleLevel_Inheritance_Child obj = new SingleLevel_Inheritance_Child();
        obj.Father();
        obj.Son();
    }

}
