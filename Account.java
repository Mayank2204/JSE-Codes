/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author hp
 */import java.util.*;
public class Account {       ////*****multiple objects*****//////
    private  int accid;
    private  String name;
    private  double balance;
    public Account(int id,String n,double b)
    {
        accid=id;
        name=n;
        balance=b;
    }
    public void show()
    {
        System.out.println("accid="+accid);
        System.out.println("name="+name);
        System.out.println("balance="+balance);
    }
    }
class useAccount
{
    public static void main(String[] args) 
    {
        
        Account []A=new Account[2];
        Scanner s=new Scanner(System.in);
        
        for(int i=0;i<A.length;i++)
        {
            System.out.println("enter id,name,balance");
            int id=s.nextInt();
            String n=s.next();
            double b=s.nextDouble();
            A[i]=new Account(id,n,b);
        
        //for(int i=0;i<A.length;i++)
        
            A[i].show();
        }
    }   
}
