/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class MyArray {
     
    
    public static void main(String[] args) 
    {
     
       Scanner s=new Scanner(System.in);
       String [] arr=new String[5];
    for(int i=0;i<5;i++)
    {
        System.out.println("enter name");
        arr[i] = s.next();
        
    }
    for(int i=0;i<5;i++)
    {
        if (arr[i].charAt(0)=='a')
    
        {
            System.out.println("names start with a are  "+arr[i]);
        } 
    }
}
}
    

   
        
    

