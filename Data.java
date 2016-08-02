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
public class Data {          /*****passing reference as arguments*****/
    private int i;
    private int j;
    public void set(int a,int b){
        i=a;
        j=b;
    }
    public void increament(Data p){
        p.i=p.i+1;
        p.j=p.j+1;
    
    }
    public void show(){
        System.out.println("i="+i+"j="+j);    
    }
}
class UseData{
    public static void main(String[] args) {
        Data d=new Data();
        d.set(1,2);
        System.out.println("befor increament");
        d.show();
        Data c=new Data();
        c.increament(d);
        System.out.println("after increament");
        d.show();
        
    }
}
