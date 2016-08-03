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
public class Box {              /*****constructor overloading*****/
    private int l;
    private int b;
    private int h;
    public Box(int a,int j,int c){
        l=a;
        b=j;
        h=c;
    }
    public Box(Box p)
    {
        l=p.l;
        b=p.b;
        h=p.h;
    }
    public void show(){
        System.out.println(+l+","+b+","+h);
    }
}
class UseBox
{
    public static void main(String[] args) {
        Box bo=new Box(1,2,3);
        Box bo1=new Box(bo);
        bo.show();
        bo1.show();
        
        
    }
}
