/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author hp
 */
import java.util.*;       //****first object oriented programme**** and
public class Student      //****object Initialization  using explicit initialisation****
{
    private int roll;
    private String name;
    private float per;
    public void SetData(int a,String b,float c)
    {
        roll=a;
        name=b;
        per=c;
    }
            
      
    public void showData()
    {
        System.out.println("roll="+roll);
        System.out.println("name="+name);
        System.out.println("percent="+per);
    }
   }
class UseStudent
{
    public static void main(String[] args) 
    {
     Student s=new Student();
     Scanner kb=new Scanner(System.in);
     int a=kb.nextInt();
     String b=kb.next();
     float c=kb.nextFloat();
     s.SetData(a, b, c);
     s.showData();
    }
}
