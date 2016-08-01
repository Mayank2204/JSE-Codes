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
import java.util.*;         //******returning values from method*****
public class Circle 
{
 int r;
 public void setRadius(int a)
 {
     r=a;
 }
public double Area()
{
    double ar;
    ar=Math.PI*Math.pow(r, 2);
    return ar;
}
public double circumference()
{
    double circ;
    circ=2*Math.PI*r;
    return circ;
}
}
class UseCircle
{
    public static void main(String[] args) 
    {
    Scanner s=new Scanner(System.in);
        System.out.println("enter radius");
    int a=s.nextInt();
    Circle c=new Circle();
    c.setRadius(a);
        System.out.println("area="+c.Area());
        System.out.println("circumference="+c.circumference());
    }
    
}







