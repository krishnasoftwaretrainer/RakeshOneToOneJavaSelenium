package polymorphism;

public class MOL_DifferentDataTypes
{
    public void Addition(int a, int b) // Integer Parameters
    {
        int sum=a+b;
        System.out.println("Addition of two integer numbers: " + sum);
    }

    public void Addition(double a, double b) //double Parameters
    {
        double sum=a+b;
        System.out.println("Addition of double numbers: " + sum);
    }

    public void Addition(float a, float b) //float Parameters
    {
        float sum=a+b;
        System.out.println("Addition of float numbers: " + sum);
    }

    public  static void main(String args[])
    {
        MOL_DifferentDataTypes mol=new MOL_DifferentDataTypes();
        mol.Addition(10,20);
        mol.Addition(10.5,20.5);
        mol.Addition(10.5f,20.5f);
    }
}
