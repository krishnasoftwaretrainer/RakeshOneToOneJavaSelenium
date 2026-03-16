package Conditional_Statements;

public class BloodDonation
{
    public static void main(String[] args)
    {
        int age=18;
        int weight=40;
    //V V , V IV, IV V, IV IV
        //true true, true false, false true, false false
        //if(age>=18 && weight>=50) //True 18>=18 true 50>=50 true
        if(age>=18 || weight>=50) //True 18>=18 true 50>=50 true
        {
            System.out.println("You are eligible for blood donation"); //You are eligible for blood donation
        }
        else
        {
            System.out.println("You are not eligible for blood donation");
        }

    }
}
