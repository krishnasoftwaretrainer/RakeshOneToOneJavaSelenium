package Inheritence;

public class MultiLevel_Inheritance_Child extends MultiLevel_Inheritance_ParentChild
{
    public void Son()
    {
        System.out.println("This is Son");
    }

    public static void main(String[] args)
    {
        MultiLevel_Inheritance_Child obj = new MultiLevel_Inheritance_Child();
        obj.GrandFather();
        obj.Father();
        obj.Son();
    }
}
