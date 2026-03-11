package Variables_DataTypes;

import java.util.Scanner;

public class StudentInformation_Dynamic {

    public  static  void main(String args[])
    {
        //byte short int long float double char String boolean
        Scanner scan=new Scanner(System.in);
        System.out.println("Scaner");
        System.out.println("Enter Student Details:");
        System.out.println("Enter Student Weight:");
        byte weight= scan.nextByte();
        System.out.println("Enter Student HTNO:");
        short htno= scan.nextShort();
        System.out.println("Enter Student CFEE:");
        int cfee=scan.nextInt();
        System.out.println("Enter Student Accnum:");
        long accnum=scan.nextLong();
        System.out.println("Enter Student CGPA:");
        float cgpa=scan.nextFloat();
        System.out.println("Enter Student Percentage:");
        double percentage= scan.nextDouble();
        System.out.println("Enter Student Gender:");
        char gender=scan.next().charAt(0);
        System.out.println("Enter Student Sname:");
        String sname=scan.next();
        System.out.println("Enter Student Result:");
        boolean result=scan.nextBoolean();

        System.out.println("Student Information");
        System.out.println("Student Name:"+sname);
        System.out.println("Student HTNO:"+htno);
        System.out.println("Student Gender:"+gender);
        System.out.println("Student Weight:"+weight);
        System.out.println("Student CGPA:"+cgpa);
        System.out.println("Student Percentage:"+percentage);
        System.out.println("Student Result:"+result);
        System.out.println("Student Weight:"+weight);
        System.out.println("Student CFee:"+cfee);


    }

}
