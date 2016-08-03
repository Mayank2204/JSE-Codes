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
public class Num {
    private int a;
    private int b;
    public void set(int i,int j){
        a=i;
        b=j;
    }
    public void show(){
        System.out.println("a="+a+",b="+b);
    }
    public void swap(Num p,Num q){
        int x;
        x=p.a;
        p.a=q.a;
        q.a=x;
        
        x=p.b;
        p.b=q.b;
        q.b=x;
        
    }
}
class UseNum{
    public static void main(String[] args) {
        Num n1=new Num();
        Num n2=new Num();
        n1.set(1,2);
        n2.set(4, 5);
        System.out.println("befor swaping");
        n1.show();
        n2.show();
        Num temp=new Num();
        temp.swap(n1,n2);
        System.out.println("after swaping");
        n1.show();
        n2.show();
    }
}