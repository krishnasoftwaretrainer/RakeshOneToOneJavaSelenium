package Inheritence;

public class MultiLevel_Inheritance_ParentChild extends MultiLevel_Inheritance_Parent
{
    public void Father()
    {
        System.out.println("This is Father");
    }


     public static void main(String[] args)
     {
         MultiLevel_Inheritance_ParentChild obj = new MultiLevel_Inheritance_ParentChild();
         obj.GrandFather();
         obj.Father();
              }
}
