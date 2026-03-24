package arrays_strings;

public class StringArray
{
    public static void main(String[] args)
    {
        String name[]=new String[5];
        name[0]="Ravi";
        name[1]="Raju";
        name[2]="Ramesh";
        name[3]="Suresh";
        name[4]="Naresh";

        for(int i=0;i<name.length;i++)
        {
            System.out.println(name[i]);
        }
    }
}
