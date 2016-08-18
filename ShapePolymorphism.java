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
public class ShapePolymorphism {
     private double d1,d2;
     public ShapePolymorphism(double d1,double d2){
         this.d1=d1;
         this.d2=d2;
     }
     public double getD1(){
         return d1;
     }
     public double getD2(){
         return d2;
     }
     public double area(){
         System.out.println("can't calculate area");
         return 0.0;
     }
}
class Rectangle extends ShapePolymorphism{
    public Rectangle(double l,double b){
        super(l,b);
    }
    public double area(){
        return getD1()*getD2();
    }
}
class Triangle extends ShapePolymorphism{
    public Triangle(double b,double h){
        super (b,h);
    }
    public double area(){
        return 0.5*getD1()*getD2();
    }
}    
class UseShape{
    public static void main(String[] args) {
        ShapePolymorphism s; 
        s=new Rectangle(10,20);
        System.out.println("srea of rect = "+s.area());
        s=new Triangle(1,2);
        System.out.println("area of rectangle = "+s.area());
    }
}
