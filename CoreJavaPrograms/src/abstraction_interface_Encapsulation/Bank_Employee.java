package abstraction_interface_Encapsulation;

public class Bank_Employee
{
    public  static void main(String[] args)
    {
        Bank_Customer customer = new Bank_Customer();

        customer.setName("John Doe");
        customer.setAccountNumber("123456789");
        customer.setBalance(1000.0);

        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Account Number: " + customer.getAccountNumber());
        System.out.println("Balance: $" + customer.getBalance());
    }
}
