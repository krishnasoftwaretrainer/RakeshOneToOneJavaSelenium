package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions
{
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        System.out.println("One");
        Thread.sleep(2000); //Checked Exception
        System.out.println("Two");
        Thread.sleep(2000); //Checked Exception
        System.out.println("Three");

        FileInputStream fis = new FileInputStream("abc.txt"); //Checked Exception

    }
}
