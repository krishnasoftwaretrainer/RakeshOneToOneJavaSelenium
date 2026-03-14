package Operators;

public class Assignment_Operators
{
    public static  void main(String args[])
    {
        /*
        int a=10,b=10,c=10,d=10,e=10;
            System.out.println(a+=5); // a=a+5: 10+5: 15
            System.out.println(b-=5); // b=b-5: 10-5: 5
            System.out.println(c*=5); // c=c*5: 10*5: 50
            System.out.println(d/=5); // d=d/5: 10/5: 2
            System.out.println(e%=5); // e=e%5: 10%5: 0
            */

        int x=10;  //Normal Variable
        System.out.println(x); //10
        System.out.println(x+=5); //15 x=15
        System.out.println(x-=5); //5 10 x=10
        System.out.println(x*=5); //50 x=50
        System.out.println(x/=5); //2 10 x=10
        System.out.println(x%=5); //0 10 x=0
        System.out.println(x); //0
        //i=1;i<=10;i++
    }
}
