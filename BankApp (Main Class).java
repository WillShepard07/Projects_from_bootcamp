package bankapp;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class BankApp {
public static void main(String[] args) {

BankApplication class1 = new BankApplication("Clark Walton-El");
BankApplication class2 = new BankApplication("Jane Foster", 75.50);
Scanner ex = new Scanner (System.in);

//Constructor 1
int sess = 1;
System.out.println("Hi "+class1.GetName()+" your balance is "+class1.GetBalance());
while (sess <= 5)
{
    System.out.println("What would you like to do? 1(Withdraw)| 2(Deposit): ");
    int ses = ex.nextInt();
    if (ses == 1)
            {
               System.out.print("How much would you like to withdraw: ");
               double withdrawAmount = ex.nextDouble();
               class1.Withdraw(withdrawAmount);
               System.out.println("Your balance is now: "+class1.GetBalance());
               sess += 1;
            }
    else if (ses == 2)
    {
        System.out.print("How much would you like to deposit: ");
        double deposit = ex.nextDouble();
        class1.Deposit(deposit);
        System.out.println("Your balance is now: "+class1.GetBalance());
        sess += 1;
    }
    else
    {
        JOptionPane.showMessageDialog(null,"Invalid input", "Warning", JOptionPane.ERROR_MESSAGE);
        sess += 1;
    }
}
System.out.println("Thanks for using us " +class1.GetName()+" your balance is now: "+class1.GetBalance());
        
        
        
//Constructor 2
int sess2 = 1;
System.out.println("\nHi "+class2.GetName()+" your balance is "+class2.GetBalance());
while (sess2 <= 5)
{
    System.out.print("What would you like to do? 1(Withdraw)| 2(Deposit): ");
    int ses = ex.nextInt();
    if (ses == 1)
            {
               System.out.print("How much would you like to withdraw: ");
               double withdraw = ex.nextDouble();
               class2.Withdraw(withdraw);
               System.out.println("Your balance is now: "+class2.GetBalance());
               sess2 += 1;
            }
    else if (ses == 2)
    {
        System.out.print("How much would you like to deposit: ");
        double deposit = ex.nextDouble();
        class2.Deposit(deposit);
        System.out.println("\nYour balance is now: "+class2.GetBalance());
        sess2 += 1;
    }
    else
    {
        JOptionPane.showMessageDialog(null,"Invalid input", "Warning", JOptionPane.ERROR_MESSAGE);
        sess2 += 1;
    }
}
System.out.println("Thanks for using us " +class2.GetName()+" your balance is now: "+class2.GetBalance()); 

    }
    
}
