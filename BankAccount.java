/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.Scanner;
//import java.lang.Exception;

        
/**
 *
 * @author hp
 */
 class BankAccount  {
     public int m=500;

        synchronized public void deposit(int i){
 
        try{
    
      Thread.sleep(100);
        if(i<0)
      {
          System.out.println("hutiya");
      }
      else{
          m=m+i;
          System.out.println("your money="+m);
      }
   }
    catch(InterruptedException ex)
        {
            System.out.println("interrupted");
        }
     }

    
    synchronized public void withdraw(int j){
    try{
        if(j>m){
            System.out.println("balance is less(in short aapki aukad nhi hai itna nikal ne ki)");
        }
        else{
            Thread.sleep(1000);
            m=m-j;
            System.out.println("you money after withdraw="+m);
    }
}

catch(InterruptedException ex)
{
    System.out.println("interrupted");
}

    }
         
}
class UseBankAccount{
    public static void main(String[] args) {
        
        BankAccount ba=new BankAccount();
        //BankAccount ba1=new BankAccount();
        System.out.println("your balance is 500");
        Scanner s=new Scanner(System.in);
        System.out.println("enter amount to deposit");
        int a=s.nextInt();
        ba.deposit(a);
        System.out.println("enter amount to withdraw");
        int b=s.nextInt();
        ba.withdraw(b);
        }
        
        
    }
        
        
    