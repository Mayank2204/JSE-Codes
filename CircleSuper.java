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
public class CircleSuper {                //********using the concept of super**********//
    private int radius;
    public CircleSuper(int radius){
        this.radius=radius;
    }
    public int getRadius(){
        return radius;
    }
    public double area(){
        return Math.PI*Math.pow(radius, 2);
    }
}
class Cylinder extends CircleSuper {
    private double height;
    public Cylinder(int radius,int height){
        super (radius);
        this.height=height;
    }
    public double area(){
        return 2*super.area()+2*Math.PI*getRadius()*height;
    }
    public double volume(){
        return super.area()*height;
    }
   /* public void show(){
        System.out.println("area of cylinder "+this.area());
        System.out.println("volume of circle "+this.volume());
    }*/
}
    class UseCylinder{
        public static void main(String[] args) {
            Cylinder c=new Cylinder(10,20);
            System.out.println("area of cylinder "+c.area());
            System.out.println("volume of circle "+c.volume());
           // c.show();
        }
    }
