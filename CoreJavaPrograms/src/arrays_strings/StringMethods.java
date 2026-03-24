package arrays_strings;

public class StringMethods
{
    public static void main(String[] args)
    {
        String name="Ravi Kumar";
        System.out.println(name.length());  //10
        System.out.println(name.charAt(3)); //i
        System.out.println(name.indexOf('a')); //1
        System.out.println(name.toUpperCase()); //RAVI KUMAR
        System.out.println(name.toLowerCase()); //ravi kumar
        System.out.println(name.replace('a','x'));
        System.out.println(name.replace("Ravi","Raju"));
        System.out.println(name.contains("Kumar")); //true
        //Trim
        String str="   Hello World   ";
        System.out.println(str);
        System.out.println(str.trim());



            }
}
