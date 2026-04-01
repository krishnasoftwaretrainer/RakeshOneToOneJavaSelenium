package polymorphism;

public class MOL_OrderOfParameters
{                                   //Interchange the order of parameters
    public void Addition(int a, double b) //Integer and double Parameters
    {
        double sum=a+b;
        System.out.println("Addition of integer and double numbers: " + sum);
    }

    public void Addition(double a, int b) //double and Integer Parameters
    {
        double sum=a+b;
        System.out.println("Addition of double and integer numbers: " + sum);
    }

    public  static void main(String args[])
    {
        MOL_OrderOfParameters mol=new MOL_OrderOfParameters();
        mol.Addition(10,20.5);
        mol.Addition(10.5,20);
    }
}
