package loopingStatements;

public class Entry_Exit_Control
{
    public static void main(String args[])
    {
        /*
      for(int i=5;i<4;i++)  //5<4F

      {
            System.out.println(i);
      } */

        int i=5;
        do
        {
            System.out.println(i); //5
            i++;  //6
        }while(i<4); //5<4F 6<=4


    }
}
