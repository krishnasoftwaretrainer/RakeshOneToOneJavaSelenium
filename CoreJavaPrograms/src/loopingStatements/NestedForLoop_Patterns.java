package loopingStatements;

public class NestedForLoop_Patterns
{
    public static void main(String[] args)
    {
        /*  1   2   3   4   5
            1   2   3   4    5
            1   2   3   4    5
            1   2   3   4    5
            1   2   3   4    5
         */
        /*
        for(int i=1; i<=5; i++)  //T
        {
            for(int j=1; j<=50; j++) //T F
            {
                System.out.print(j + "   ");
            }
            System.out.println();
        } */
        /* OuterLoop:
        i=1;i<=5;1<=5;true
            InnerLoop:
            j=1;j<=5;1<=5;true
            j++;j=2;j<=5;2<=5;true
            j++;j=3;j<=5;3<=5;true
            j++;j=4;j<=5;4<=5;true
            j++;j=5;j<=5;5<=5;true
            j++;j=6;j<=5;6<=5;false
     OuterLoop:
        i++;i=2;i<=5;2<=5;true
            InnerLoop:
            j=1;j<=5;1<=5;true
            j++;j=2;j<=5;2<=5;true
            j++;j=3;j<=5;3<=5;true
            j++;j=4;j<=5;4<=5;true
            j++;j=5;j<=5;5<=5;true
            j++;j=6;j<=5;6<=5;false
        OuterLoop:
        i++;i=3;i<=5;3<=5;true
            InnerLoop:
            j=1;j<=5;1<=5;true
            j++;j=2;j<=5;2<=5;true
            j++;j=3;j<=5;3<=5;true
            j++;j=4;j<=5;4<=5;true
            j++;j=5;j<=5;5<=5;true
            j++;j=6;j<=5;6<=5;false
        OuterLoop:
        i++;i=6;i<=5;6<=5;false Exit


        1    2  3   4   5
        1   2   3   4   5
        1   2   3   4   5
        1   2   3   4   5
        1   2   3   4   5

         */

        /* 1
           1    2
           1    2   3
           1    2   3   4
           1    2   3   4   5
           -------------------
           1    2   3   4   5
           1    2   3   4
           1    2   3
           1    2
           1
         */
        /*
        for(int i=1; i<=20; i++)  //T 1<=5 true 2<=5 T
        {
            for(int j=1; j<=i; j++) //T F  //1<=1 true 2<=1 false 1<=2 true 2<=2 true 3<=2 false
            {
                System.out.print(j + "   ");
            }
            System.out.println();
        }*/

        for(int i=1; i<=5; i++)  //T 5>=1 true 4>=1 T
        {
            for (int j = 5; j >= i; j--)
            {
                System.out.print(j + "   ");
            }
            System.out.println();
        }
    }
}
