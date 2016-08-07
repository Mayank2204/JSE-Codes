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
class Box_ThisPrac {                    //chaining of constructor using this//
    private int l,b,h;
    public Box_ThisPrac(){
        this (0,0,0);
    }
    public Box_ThisPrac(int s){
        this(s,s,s);
    }
    public Box_ThisPrac(int l,int b,int h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    public void Show(){
        System.out.println("l= "+l+",b= "+b+",h= "+h);
    }
}
class UseBox_ThisPrac{
    public static void main(String[] args) {
        Box_ThisPrac b1=new Box_ThisPrac();
        Box_ThisPrac b2=new Box_ThisPrac(10);
        Box_ThisPrac b3=new Box_ThisPrac(20,30,40);
        b1.Show();
        b2.Show();
        b3.Show();
    }
}