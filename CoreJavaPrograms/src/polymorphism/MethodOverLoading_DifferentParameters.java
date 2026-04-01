package polymorphism;

public class MethodOverLoading_DifferentParameters
{
    public void Addition(int a, int b) //2Parameters
    {
        int sum=a+b;
        System.out.println("Addition of two numbers: " + sum);
    }

    public void Addition(int a, int b,int c) //3 Parameters
    {
        int sum=a+b+c;
        System.out.println("Addition of three numbers: " + sum);
    }

    public void Addition(int a, int b,int c,int d) //4 Parameters
    {
        int sum=a+b+c+d;
        System.out.println("Addition of four numbers: " + sum);
    }

    public  static void main(String args[])
    {
        MethodOverLoading_DifferentParameters mol=new MethodOverLoading_DifferentParameters();
        mol.Addition(10,20);
        mol.Addition(10,20,30);
        mol.Addition(10,20,30,40);
    }
}
