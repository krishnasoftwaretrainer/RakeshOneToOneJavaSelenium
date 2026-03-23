package loopingStatements;

public class JumpingStatements
{
    public static void main(String[] args)
    {
        for(int i=1; i<=10; i++)//1<=10
        {
            if(i==5)  //
            //if(i>=5) //5>=5T 6>=5T 7>=5T 8>=5T 9>=5T 10>=5T
            {
               //break; //it will stop the loop when i is 5
                continue;
            }
            System.out.println(i);  //1 2 3 4 6 7 8 9 10
        }
           }

}
