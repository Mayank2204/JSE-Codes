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
public class StaticPrac {
    int a;
    static int b;
}
class UseStaticPrac{
    public static void main(String[] args) {
    StaticPrac sp1=new StaticPrac();
    StaticPrac sp2=new StaticPrac();
    sp1.a=10;
    sp2.a=20;
        System.out.println("sp1.a="+sp1.a+",sp2.a="+sp2.a);
    StaticPrac.b=10;
    StaticPrac.b=20;
        System.out.println(StaticPrac.b);
    sp1.b=10;
    //sp2.b=20;
        System.out.println("sp1.b="+sp1.b+"sp2.b="+sp2.b);
    }
}