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
public class InsufficientFundsException extends Exception {

   
    public InsufficientFundsException() {
      
    }
  
}
 class BankAccount1  {
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

    
    synchronized public void withdraw(int j)throws InsufficientFundsException{
    
        if(j>m){
           // System.out.println("balance is less(in short aapki aukad nhi hai itna nikal ne ki)");
            throw new InsufficientFundsException();
        }
        else{
            
            m=m-j;
            System.out.println("your money after withdraw="+m);
    }
}



    }
         

class UseBankAccount1{
    public static void main(String[] args) {
        
        BankAccount1 ba=new BankAccount1();
        //BankAccount ba1=new BankAccount();
        System.out.println("your balance is 500");
        Scanner s=new Scanner(System.in);
        System.out.println("enter amount to deposit");
        int a=s.nextInt();
        ba.deposit(a);
        try{
        //while(ba.MyThread.isAlive())
        //{
        System.out.println("enter amount to withdraw");
        int b=s.nextInt();
        //Thread.sleep(1500);
        ba.withdraw(b);
        }
        catch(InsufficientFundsException e){
            System.out.println("money in your account is less");
        
    }
       // catch(InterruptedException ex){
         //   System.out.println("interrupted");
        
    //}
    //}
    }
    }