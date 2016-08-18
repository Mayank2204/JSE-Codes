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
abstract class AbstractShape {
     private double d1,d2;
     public AbstractShape(double d1,double d2){
         this.d1=d1;
         this.d2=d2;
     }
     public double getD1(){
         return d1;
     }
     public double getD2(){
         return d2;
     }
     abstract public double area();
     //{
         //System.out.println("can't calculate area");
         //return 0.0;
     //}
}
class AbsRectangle extends AbstractShape{
    public AbsRectangle(double l,double b){
        super(l,b);
    }
    public double area(){
        return getD1()*getD2();
    }
}
class AbsTriangle extends AbstractShape{
    public AbsTriangle(double b,double h){
        super (b,h);
    }
    public double area(){
        return 0.5*getD1()*getD2();
    }
}    
class UseAbstractShape{
    public static void main(String[] args) {
        AbstractShape s; 
       s =new AbsRectangle(10,20);
        System.out.println("srea of rect = "+s.area());
        s=new AbsTriangle(1,2);
        System.out.println("area of rectangle = "+s.area());
    }
}
