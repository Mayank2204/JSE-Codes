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
 interface IntShape {
     abstract double  area();
    
}
class intCircle implements IntShape{
    double radius;
    public intCircle(double radius){
        this.radius=radius;
    }
    public double area(){
        return Math.PI*Math.pow(radius, 2);
    }
}
class intRectangle implements IntShape{
    double l,b;
    public intRectangle(double l,double b){
        this.l=l;
        this.b=b;
    }
    public double area(){
        return l*b; 
    }    
}  
class UseIntShape{
    public static void main(String[] args) {
        IntShape s;
        s=new intRectangle(1,2);
        System.out.println("area of rectangle = "+s.area());
        s=new intCircle(4);
        System.out.println("area of circle = "+s.area());
    }
}