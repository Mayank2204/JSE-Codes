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
public class ExpOverriding {                  ///*******example for overriding********///
    public void show(int i){
        System.out.println("in show of ExpOverriding with int"+i);
    }
    public void show(String s){
        System.out.println("in show of ExpOverriding with String "+s);
    }
}

class ExpOverriding1 extends ExpOverriding{
    public void show(int i){
         super.show(i);
        System.out.println("in show of ExpOverriding1 with int "+i);
        //super.show(i);
    }
    public void show(double d){
        System.out.println("in shoe of ExpOverriding1 with double "+d);
    }
}
class UseExpOverriding1{
    public static void main(String[] args) {
        ExpOverriding1 e1=new ExpOverriding1();
        e1.show(11.11);
        e1.show("hello");
        e1.show(12);
        
    }
}