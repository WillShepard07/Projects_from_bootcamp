package bankapp;

import javax.swing.JOptionPane;

public class BankApplication {
       private String name;
       private double balance;

      public BankApplication(String x)
   {
       this.name=x;
   }
      
   public BankApplication(String n, double b)
   {
       this.name=n;
     
       this.balance = b;
       
   }
      
   void Withdraw(double withdrawAmount)
   {
       if (withdrawAmount < balance)
       {
           balance = balance - withdrawAmount;
       }
       else
       {
           JOptionPane.showMessageDialog(null,"Insufficiant Funds", "Warning", JOptionPane.ERROR_MESSAGE);
       }
   }
   
   void Deposit(double depositAmount)
   {
      if (depositAmount <= 1000)
       {
           balance = balance + depositAmount;
       } 
       else
       {
           JOptionPane.showMessageDialog(null,"Unable to deposit", "Warning", JOptionPane.ERROR_MESSAGE);
       }
   }
   
   void SetBalance (double b)
   {
    this.balance=balance; 
   }
   
   public String GetName()
   {
     return name;  
   }
   
   public double GetBalance()
   {
     return balance;  
   }

    
}
