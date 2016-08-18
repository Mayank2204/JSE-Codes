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
public class LateEarlyBinding {
    public static void show(){
            System.out.println("in show of A");
    }
    public void display(){
        System.out.println("in display of A");
    }
}
class B extends LateEarlyBinding{
    public static void show(){
        System.out.println("in show of B");
    }
    public void display(){
        System.out.println("in display of B");
    }
}
class UseA{
    public static void main(String[] args) {
       LateEarlyBinding a=new LateEarlyBinding();
       a.show();
       a.display();
       System.out.println("---------------------");
       a=new B();
       a.show();
       a.display();
        System.out.println("---------------------");
        B b=new B();
        b.show();
        b.display();
        System.out.println("----------------------");
       
        
    }
}


