package practice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class StaticPrac2 {
    public static double pi=3.14;
    public StaticPrac2(){
        System.out.println("contructor block");
    }
    static{
        System.out.println("static block");
    }
    
}
class UseStaticPrac2{
    public static void main(String[] args) {
       StaticPrac2 s1=new StaticPrac2();
       StaticPrac2 s2=new StaticPrac2();
        System.out.println("value of pi="+StaticPrac2.pi);
        System.out.println("value of pi="+StaticPrac2.pi);
    }
}